package com.jensen.seatabank1.controller;


import com.jensen.seatabank1.model.entity.B1Bank;
import com.jensen.seatabank1.service.IB1BankService;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.util.List;

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
public class B1BankController {

    private final IB1BankService ib1BankService;

    @GetMapping("/selectBank")
    public List<B1Bank> selectBank() {
        return ib1BankService.selectBank();
    }

    @PostMapping("/updateBank")
    public String updateBank(@RequestBody B1Bank bank) {
        return ib1BankService.updateBank(bank);
    }

}

