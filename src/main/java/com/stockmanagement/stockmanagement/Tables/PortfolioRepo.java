package com.stockmanagement.stockmanagement.Tables;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepo extends JpaRepository<Portfolio, Integer> {
}