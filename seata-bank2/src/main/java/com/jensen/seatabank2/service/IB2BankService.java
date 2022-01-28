package com.jensen.seatabank2.service;

import com.jensen.seatabank2.model.entity.B2Bank;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;

/**
 * <p>
 * 银行账户表 服务类
 * </p>
 *
 * @author 作者
 * @since 2022-01-28
 */
public interface IB2BankService extends IService<B2Bank> {

    B2Bank selectBank();

    int updateBank(BigDecimal amount);
}
