package com.example.exchangerates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements Callback<CurrencyExchange> {


    private RecyclerView recv;
    private SwipeRefreshLayout swipe;
    List<Currency>dblist=new ArrayList<>();
    AppDatabase db;
    Currency cc;
    List<Currency>dbSelect=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swipe=findViewById(R.id.swipe);
        recv=findViewById(R.id.recv);
        recv.setHasFixedSize(true);
        recv.setLayoutManager(new LinearLayoutManager(this));
         db= Room.databaseBuilder(getApplicationContext(),AppDatabase.class,"Currency")
                .allowMainThreadQueries()
                .build();
       loadCurrencyExchangeData();
         swipe.setOnRefreshListener(    new SwipeRefreshLayout.OnRefreshListener() {
             @Override
             public void onRefresh() {
                 new Handler().postDelayed(new Runnable() {
                     @Override
                     public void run() {
                         loadCurrencyExchangeData();
                         swipe.setRefreshing(false);
                     }
                 },3000);
             }
         });

    }

    @Override
    protected void onStart() {
        super.onStart();
       // loadCurrencyExchangeData();
    }

    private void loadCurrencyExchangeData(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://forex.cbm.gov.mm/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CurrencyExchangeService service = retrofit.create(CurrencyExchangeService.class);
        Call<CurrencyExchange> call = service.loadCurrencyExchange("latest");
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<CurrencyExchange> call, Response<CurrencyExchange> response) {
      if(response.isSuccessful()){
          CurrencyExchange currencyExchange = response.body();
          dblist.clear();
         //  recv.setAdapter(new CurrencyRecvAdapter(this, currencyExchange.getCurrencyList()));
          dblist=currencyExchange.getCurrencyList();
          addDB();
          selectDB();

      }else {
          Toast.makeText(getApplicationContext(),"Api error!",Toast.LENGTH_LONG).show();
      }

    }

    private void selectDB() {
        dbSelect.clear();
       dbSelect =db.daoAccess().getAllCurrency();
        recv.setAdapter(new CurrencyRecvAdapter(this,dbSelect));
    }

    private void addDB() {
        dbSelect.clear();
        dbSelect=db.daoAccess().getAllCurrency();
        if(dbSelect.size()>0){
            for(int j=0;j<dbSelect.size();j++){
                db.daoAccess().delAll(dbSelect.get(j).getId());
            }
            dbSelect=db.daoAccess().getAllCurrency();
        }

        if(dbSelect.size()==0){
            for(int i=0;i<dblist.size();i++){
                cc=new Currency(dblist.get(i).getName(),dblist.get(i).getRate(),dblist.get(i).getLname());
                db.daoAccess().insertAll(cc);
            }
        }

     }

    @Override
    public void onFailure(Call<CurrencyExchange> call, Throwable t) {
        Toast.makeText(this,"Please connect to Internet, Can get the latest Exchange Rates.", Toast.LENGTH_LONG).show();
        selectDB();
    }

}
