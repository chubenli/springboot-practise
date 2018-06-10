package com.chibun.dataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


//@Configuration // 注册到springboot容器中
//@MapperScan(basePackages = "com.chibun.test02.mapper", sqlSessionFactoryRef = "test02SqlSessionFactory")
public class DataSource2Config {

  /*  *//**
     *
     * @methodDesc: 功能描述:(配置test02数据库)
     *//*
    @Bean(name = "test02DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.test02")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }

    *//**
     *
     * @methodDesc: 功能描述:(test02 sql会话工厂)
     *//*
    @Bean(name = "test02SqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("test02DataSource") DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        //使用mybaitesXML配置使用这种方式注入
//		bean.setMapperLocations(
//				new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/test1/*.xml"));
        return bean.getObject();
    }

    *//**
     *
     * @methodDesc: 功能描述:(test02 事务管理)
     *//*
    @Bean(name = "test02TransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("test02DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "test02SqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(
            @Qualifier("test02SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }*/

}
