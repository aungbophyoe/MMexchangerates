package com.example.exchangerates;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DaoAccess {

    @Query("SELECT * FROM Currency")
    List<Currency> getAllCurrency();

    @Insert
    void insertAll(Currency... currencies);

    @Query("Delete From Currency Where id=:id")
    void delAll(int id);
}