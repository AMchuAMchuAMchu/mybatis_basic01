package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description ==> TODO
 * BelongsProject ==> mybatis_basic01
 * BelongsPackage ==> com.itheima.config
 * Version ==> 1.0
 * CreateTime ==> 2022-10-15 09:14:55
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Configuration
@ComponentScan("com.itheima.service")
@Import({JdbcConfig.class,MybatisConfig.class})
@PropertySource("classpath:jdbc.properties")
@Transactional
public class SpringConfig {
}
