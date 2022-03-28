package com.guusto.balanceapi.controller;

import com.guusto.balanceapi.entity.Balance;
import com.guusto.balanceapi.service.BalanceApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/guusto-service-balance")
public class BalanceController {
    public static final Logger logger = LoggerFactory.getLogger(BalanceController.class);

    @Autowired
    public BalanceApiService balanceApiService;

    @GetMapping(value = "/get-balance")
    public List<Balance> getBalanceAll()
    {
        return balanceApiService.getBalanceOfClient();
    }
    @GetMapping(value = "/get-balance-by-cliId")
    @ResponseBody
    public Balance getBalanceByClientId(@RequestParam  long clientId)
    {
        return balanceApiService.getBalanceByClientId(clientId);
    }

}
