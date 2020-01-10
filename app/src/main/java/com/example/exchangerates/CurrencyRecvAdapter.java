package com.example.exchangerates;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CurrencyRecvAdapter extends RecyclerView.Adapter<CurrencyRecvAdapter.ViewHolder> {
    private Context context;
    private LayoutInflater layoutInflater;
    private List<Currency> currencyList;

    public CurrencyRecvAdapter(Context context, List<Currency> currencyList) {
        this.context = context;
        this.currencyList = currencyList;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.currency_item,parent,false);
        return new CurrencyRecvAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Currency c = currencyList.get(position);
        holder.tvname.setText(c.getName());
        holder.tvrate.setText(c.getRate());
        holder.lname.setText(c.getLname());
        Animation anim= AnimationUtils.loadAnimation(context,android.R.anim.slide_in_left);
        holder.itemView.startAnimation(anim);
    }

    @Override
    public int getItemCount() {
        return currencyList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvname;
        private TextView tvrate;
        private TextView lname;


        public ViewHolder(View itemView) {
            super(itemView);
            tvname =itemView.findViewById(R.id.tvName);
            tvrate =itemView.findViewById(R.id.tvRate);
            lname=itemView.findViewById(R.id.lname);




        }
    }
}
