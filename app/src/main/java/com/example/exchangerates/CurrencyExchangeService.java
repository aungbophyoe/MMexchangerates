package com.example.exchangerates;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface CurrencyExchangeService {
    @GET
    Call<CurrencyExchange> loadCurrencyExchange(@Url String url);


}
