package com.jensen.seatabank2.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.jensen.seatabank2.model.entity.B2Bank;
import com.jensen.seatabank2.mapper.B2BankMapper;
import com.jensen.seatabank2.service.IB2BankService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * <p>
 * 银行账户表 服务实现类
 * </p>
 *
 * @author 作者
 * @since 2022-01-28
 */
@Service
@RequiredArgsConstructor
public class B2BankServiceImpl extends ServiceImpl<B2BankMapper, B2Bank> implements IB2BankService {

    private final B2BankMapper b2BankMapper;

    @Override
    public B2Bank selectBank() {
        return b2BankMapper.selectOne(new LambdaQueryWrapper<B2Bank>()
                .eq(B2Bank::getAccountNumber, "456"));

    }

    @Override
    public int updateBank(BigDecimal amount) {
        B2Bank b2Bank = b2BankMapper.selectOne(new LambdaQueryWrapper<B2Bank>()
                .eq(B2Bank::getAccountNumber, "456"));
        BigDecimal newBalance = b2Bank.getAccountBalance().add(amount);

        int update = b2BankMapper.update(null, new UpdateWrapper<B2Bank>().lambda()
                .eq(B2Bank::getAccountNumber, "456")
                .set(B2Bank::getAccountBalance, newBalance));
        if (update > 0) {
            return -1;
        } else {
            return newBalance.intValue();
        }
    }

}
