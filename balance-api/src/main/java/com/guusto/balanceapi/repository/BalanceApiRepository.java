package com.guusto.balanceapi.repository;

import com.guusto.balanceapi.entity.Balance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BalanceApiRepository extends JpaRepository<Balance,Long> {

    //public List<Balance> getBalanceByClientId();

}
