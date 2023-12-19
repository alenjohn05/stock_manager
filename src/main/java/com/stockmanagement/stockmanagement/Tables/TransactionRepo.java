package com.stockmanagement.stockmanagement.Tables;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepo extends JpaRepository<Transaction, Integer> {
    List<Transaction> findByStockSymContaining(String stockSymbol);

    List<Transaction> findByType(String type);
}
