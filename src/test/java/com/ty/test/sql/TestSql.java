package com.ty.test.sql;

import com.alibaba.druid.pool.DruidDataSource;
import com.ty.test.TestApplication;
import com.ty.test.dao.test1.UserMapper;
import com.ty.test.dao.test2.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class TestSql {

    @Resource
    private DruidDataSource test1DataSource;
    @Resource
    private DruidDataSource test2DataSource;

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testDataSourceOne() {
        assertThat(test1DataSource.getUrl()).isEqualTo("jdbc:mysql://localhost:3306/test1?useSSL=false");
    }
    @Test
    public void testDataSourceTwo() {
        assertThat(test2DataSource.getUrl()).isEqualTo("jdbc:mysql://localhost:3306/test2?useSSL=false");
    }

    @Test
    public void testDataService(){
        assertThat(userMapper.countUserNum()).isGreaterThan(0);
    }

    @Test
    public void testStudentService(){
        assertThat(studentMapper.countStudentNum()).isGreaterThan(0);
    }
}
