package com.jensen.seatabank1.service;

import com.jensen.seatabank1.model.entity.B1Bank;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 银行账户表 服务类
 * </p>
 *
 * @author 作者
 * @since 2022-01-28
 */
public interface IB1BankService extends IService<B1Bank> {

    List<B1Bank> selectBank();

    int updateBank(BigDecimal amount);
}
