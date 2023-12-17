package com.stockmanagement.stockmanagement.DtoClasses;

import com.stockmanagement.stockmanagement.Tables.Stocks;
import com.stockmanagement.stockmanagement.Tables.User;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PortfolioDTO {

    private Integer portfolio_id;
    private Integer shares;
    private String stock_id;
    private Long current_price;
    private Long cost_basis;
    private Integer yield;
    private List<User> user;
    private List<Stocks> stocks;

}
