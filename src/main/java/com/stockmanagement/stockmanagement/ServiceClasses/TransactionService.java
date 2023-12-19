package com.stockmanagement.stockmanagement.ServiceClasses;

import com.stockmanagement.stockmanagement.DtoClasses.TransactionDTO;

import java.util.List;

public interface TransactionService {
    TransactionDTO addTransaction(TransactionDTO transactionDTO);
    TransactionDTO getTransaction(Integer t_id);
    TransactionDTO updateTransaction(Integer t_id, TransactionDTO transactionDTO);
    String deleteTransaction(Integer t_id);

    List<TransactionDTO> getAllTransactions();

    List<TransactionDTO> searchByStockSymbol(String stockSymbol);

    long getTotalTransactionCount();

    List<TransactionDTO> getTransactionsByType(String type);

    String deleteAllTransactions();
}
