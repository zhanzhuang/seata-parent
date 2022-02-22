package com.jensen.seatabank1.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.jensen.seatabank1.feign.FeignClientSeataBank2;
import com.jensen.seatabank1.model.entity.B1Bank;
import com.jensen.seatabank1.mapper.B1BankMapper;
import com.jensen.seatabank1.service.IB1BankService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

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
public class B1BankServiceImpl extends ServiceImpl<B1BankMapper, B1Bank> implements IB1BankService {

    private final B1BankMapper b1BankMapper;

    private final FeignClientSeataBank2 feignClientSeataBank2;

    @Override
    public List<B1Bank> selectBank() {
        List<B1Bank> b1BankList = b1BankMapper.selectList(new LambdaQueryWrapper<B1Bank>());
        return b1BankList;
    }

    @Override
    public String updateBank(B1Bank inPo) {
        B1Bank b1Bank = b1BankMapper.selectOne(new LambdaQueryWrapper<B1Bank>()
                .eq(B1Bank::getAccountNumber, "123"));
        BigDecimal newBalance = b1Bank.getAccountBalance().subtract(inPo.getAccountBalance());
        b1BankMapper.update(null, new UpdateWrapper<B1Bank>().lambda()
                .eq(B1Bank::getAccountNumber, "123")
                .set(B1Bank::getAccountBalance, newBalance));
        int updateBank2 = feignClientSeataBank2.updateBank(inPo);
        if (updateBank2 == -1) {
            return "bank2操作失败，请查看日志";
        }
        return "转账成功，请查询新余额";
    }
}
