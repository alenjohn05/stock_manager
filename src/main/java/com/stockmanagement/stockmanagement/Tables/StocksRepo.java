package com.stockmanagement.stockmanagement.Tables;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StocksRepo extends JpaRepository<Stocks, Integer> {
}
