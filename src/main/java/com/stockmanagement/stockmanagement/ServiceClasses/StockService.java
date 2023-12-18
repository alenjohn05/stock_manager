package com.stockmanagement.stockmanagement.ServiceClasses;

import com.stockmanagement.stockmanagement.DtoClasses.StocksDTO;

public interface StockService {
    StocksDTO addStocks(StocksDTO stocksDTO);
    StocksDTO getStocks(Integer stock_id);
    StocksDTO updateStocks(Integer stock_id, StocksDTO stocksDTO);
    String deleteStocks(Integer stock_id);
}

