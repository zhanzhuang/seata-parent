package com.jensen.seatabank1.feign;

import com.jensen.seatabank1.model.entity.B1Bank;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@FeignClient(value = "seata-bank2")// 服务名不区分大小写
@Repository
public interface FeignClientSeataBank2 {

    @PostMapping("bankController/updateBank")
    int updateBank(@RequestBody B1Bank bank);
}
