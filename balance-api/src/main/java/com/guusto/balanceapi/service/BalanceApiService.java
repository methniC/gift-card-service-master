package com.guusto.balanceapi.service;

import com.guusto.balanceapi.entity.Balance;
import com.guusto.balanceapi.repository.BalanceApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BalanceApiService {

    @Autowired
    public   BalanceApiRepository balanceApiRepository;

    public List<Balance> getBalanceOfClient() {
        return balanceApiRepository.findAll();
    }


    public Balance getBalanceByClientId(long clientId) {
        Optional<Balance> currentBalance = balanceApiRepository.findById(clientId);
        if(currentBalance.isPresent()) {
            return balanceApiRepository.getById(clientId);
        }
        else {
            return  new Balance();
        }

    }
}
