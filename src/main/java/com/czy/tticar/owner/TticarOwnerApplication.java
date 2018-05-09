package com.czy.tticar.owner;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author chengxy
 * @date 2018/5/9 10:54
 */
@MapperScan("com.czy.tticar.owner.mapper")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableScheduling
@ServletComponentScan
public class TticarOwnerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TticarOwnerApplication.class, args);
    }
}
