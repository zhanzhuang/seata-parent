package com.jensen.seatabank2.config;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;

import java.util.Collections;

public class CodeGenerator {
    static final String URL = "jdbc:mysql://localhost:3306/seata-bank2?characterEncoding=utf8&allowMultiQueries=true&useSSL=false&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true";

    public static void main(String[] args) {
        FastAutoGenerator.create(URL, "root", "123456")
                .globalConfig(builder ->
                        builder
                                .fileOverride()
                                .outputDir(System.getProperty("user.dir") + "/seata-bank2/src/main/java")
                )
                .packageConfig(builder ->
                        builder
                                .parent("com.jensen")
                                .moduleName("seatabank2")
                                .entity("model.entity")
                                .pathInfo(Collections.singletonMap(OutputFile.mapperXml, System.getProperty("user.dir") + "/seata-bank2/src/main/resources/mapper"))
                )
                .strategyConfig(builder ->
                        builder
                                .addInclude("b2_bank")
//                                .addInclude("other_table")
                )
                .execute();
    }
}
