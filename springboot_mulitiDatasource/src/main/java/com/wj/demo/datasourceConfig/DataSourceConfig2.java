package com.wj.demo.datasourceConfig;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = DataSourceConfig2.PACK_NAME,sqlSessionFactoryRef = "datasource2SqlSessionFactory")
public class DataSourceConfig2 {

    static final String PACK_NAME="com.wj.demo.dao.datasource2Dao";
    static final String MAPPER_LOCATION="classpath:mapping/datasource2/*.xml";

    @Value("${datasource2.datasource.url}")
    private String url;

    @Value("${datasource2.datasource.username}")
    private String user;

    @Value("${datasource2.datasource.password}")
    private String password;

    @Value("${datasource2.datasource.driverClassName}")
    private String driverClass;

    @Bean(name = "datasource2DataSource")
    public DataSource datasource2DataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "datasource2TransactionManager")
    public DataSourceTransactionManager datasource2TransactionManager() {
        return new DataSourceTransactionManager(datasource2DataSource());
    }

    @Bean(name = "datasource2SqlSessionFactory")
    public SqlSessionFactory datasource2SqlSessionFactory(@Qualifier("datasource2DataSource") DataSource datasource2DataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(datasource2DataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(DataSourceConfig2.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
