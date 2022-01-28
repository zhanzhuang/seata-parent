package com.jensen.seatabank1.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 银行账户表
 * </p>
 *
 * @author 作者
 * @since 2022-01-28
 */
@TableName("b1_bank")
public class B1Bank implements Serializable {

    private static final long serialVersionUID = 1L;

      private String id;

    /**
     * 账号
     */
    private String accountNumber;

    /**
     * 余额
     */
    private BigDecimal accountBalance;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "B1Bank{" +
        "id=" + id +
        ", accountNumber=" + accountNumber +
        ", accountBalance=" + accountBalance +
        "}";
    }
}
