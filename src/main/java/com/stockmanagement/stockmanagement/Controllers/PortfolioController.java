package com.stockmanagement.stockmanagement.Controllers;

import com.stockmanagement.stockmanagement.DtoClasses.PortfolioDTO;
import com.stockmanagement.stockmanagement.ServiceClasses.PortfolioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/portfolio/")
@AllArgsConstructor
public class PortfolioController {
    private PortfolioService portfolioService;
    @PostMapping()
    public ResponseEntity<PortfolioDTO> addPortfolio(@RequestBody PortfolioDTO portfolioDTO) {
        try {
            if (portfolioDTO.getPortfolio_id() == null || portfolioDTO.getPortfolio_id().toString().isEmpty()) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        } catch (NullPointerException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        PortfolioDTO savedPortfolio = portfolioService.addPortfolio(portfolioDTO);
        return new ResponseEntity<>(savedPortfolio, HttpStatus.CREATED);
    }
}
