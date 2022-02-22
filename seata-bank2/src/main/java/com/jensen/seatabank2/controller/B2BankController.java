package com.jensen.seatabank2.controller;


import com.jensen.seatabank2.model.entity.B2Bank;
import com.jensen.seatabank2.service.IB2BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.math.BigDecimal;

/**
 * <p>
 * 银行账户表 前端控制器
 * </p>
 *
 * @author 作者
 * @since 2022-01-28
 */
@RestController
@RequestMapping("/bankController")
@RequiredArgsConstructor
public class B2BankController {

    private final IB2BankService ib2BankService;

    @GetMapping("/selectBank")
    public B2Bank selectBank() {
        return ib2BankService.selectBank();
    }

    @PostMapping("/updateBank")
    public int updateBank(@RequestBody B2Bank bank) {
        return ib2BankService.updateBank(bank.getAccountBalance());
    }


}

