//package com.lanxing.boot.dao.configuration;
//
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.transaction.annotation.TransactionManagementConfigurer;
//
//import javax.annotation.Resource;
//import javax.sql.DataSource;
//
///**
// * @author gaofan
// * @version 1.0
// * @date 2017/8/3 下午5:23
// * @desc 功能描述
// */
//@Configuration
//@EnableTransactionManagement
//@MapperScan("com.lanxing.boot.dao.mapper")
//public class SessionFactoryConfig implements TransactionManagementConfigurer {
//
//    @Autowired
//    private DataSource dataSource;
//
//    @Override
//    public PlatformTransactionManager annotationDrivenTransactionManager() {
//        return null;
//    }
//
//    public DataSource getDruidDataSource() {
//        return dataSource;
//    }
//
//    public void setDruidDataSource(DataSource druidDataSource) {
//        this.druidDataSource = druidDataSource;
//    }
//}
