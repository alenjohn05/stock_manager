package com.stockmanagement.stockmanagement.ServiceClasses;

import com.stockmanagement.stockmanagement.DtoClasses.PortfolioDTO;

public interface PortfolioService {
    PortfolioDTO addPortfolio(PortfolioDTO portfolioDTO);

    PortfolioDTO getPortfolio(Integer portfolio_id);

    PortfolioDTO updatePortfolio(Integer portfolio_id, PortfolioDTO portfolioDTO);

    String deletePortfolio(Integer portfolio_id);
}
