package com.jensen.seatabank2.controller;


import com.jensen.seatabank2.model.entity.B2Bank;
import com.jensen.seatabank2.service.IB2BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/updateBank")
    public int updateBank(@RequestParam BigDecimal amount) {
        return ib2BankService.updateBank(amount);
    }


}

