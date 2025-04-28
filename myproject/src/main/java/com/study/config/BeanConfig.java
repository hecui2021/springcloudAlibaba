package com.study.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author peterche
 * @Description
 * @Date 2023/3/23 11:37
 **/
@Configuration
public class BeanConfig {

    /**
     * 默认不连接mysql（HikariDataSource是lazy initialization的方式，启动时不进行初始化，不check 数据库连接），用于本地测试某些不依赖数据的方法，不用检查数据库。
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource getMainDataSource() {
        return new HikariDataSource();
    }

}
