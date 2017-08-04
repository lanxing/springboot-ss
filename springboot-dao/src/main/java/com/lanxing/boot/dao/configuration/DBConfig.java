//package com.lanxing.boot.dao.configuration;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
///**
// * @author gaofan
// * @version 1.0
// * @date 2017/8/3 下午3:27
// * @desc 功能描述
// */
//@ConfigurationProperties(prefix = "spring.datasource")
//@Configuration
//public class DBConfig {
//
//    @Value("${url}")
//    private String url;
//
//    @Value("${userName}")
//    private String userName;
//    @Value("${passWord}")
//    private String passWord;
//    @Value("${initialSize}")
//    private Integer initialSize;
//    @Value("${minIdle}")
//    private Integer minIdle;
//    @Value("${maxActive}")
//    private Integer maxActive;
//    @Value("${maxWait}")
//    private Long maxWait;
//    @Value("${timeBetweenEvictionRunsMillis}")
//    private int timeBetweenEvictionRunsMillis;
//    @Value("${minEvictableIdleTimeMillis}")
//    private int minEvictableIdleTimeMillis;
//    @Value("${testWhileIdle}")
//    private boolean testWhileIdle;
//    @Value("${testOnBorrow}")
//    private boolean testOnBorrow;
//    @Value("${validationQuery}")
//    private String validationQuery;
//
//
//
//    @Bean(initMethod = "init", destroyMethod = "close")
//    public DataSource druidDataSource(){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setUsername(userName);
//        dataSource.setPassword(passWord);
//        dataSource.setUrl(url);
//        dataSource.setInitialSize(initialSize);
//        dataSource.setMinIdle(minIdle);
//        dataSource.setMaxActive(maxActive);
//        dataSource.setMaxWait(maxWait);
//        dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
//        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
//        dataSource.setTestWhileIdle(testWhileIdle);
//        dataSource.setTestOnBorrow(testOnBorrow);
//        dataSource.setValidationQuery(validationQuery);
//        return dataSource;
//    }
//
////    @Bean
////    public SqlSessionFactory sqlSessionFactory() throws Exception {
////        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
////        sqlSessionFactoryBean.setDataSource(dataSource());
////        sqlSessionFactoryBean.setTypeAliasesPackage("com.lanxing.boot.dao.model");
////        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
////        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/com/lanxing/boot/dao/mapper/*.xml"));
////        return sqlSessionFactoryBean.getObject();
////    }
////
////    @Bean
////    public PlatformTransactionManager transactionManager() throws SQLException {
////        return new DataSourceTransactionManager(dataSource());
////    }
//}
