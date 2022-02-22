package com.jensen.seatabank2.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "seata-bank1")// 服务名不区分大小写
public interface FeignClientSeataBank1 {

}
