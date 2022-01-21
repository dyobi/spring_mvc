package com.Employee;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class EmployeeDao {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        String myxml = "Mybatis-config.xml";
        InputStream inputStream = null;

        try {
            inputStream = Resources.getResourceAsStream(myxml);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    // 본격적인 dao 준비
    public static List<EmployeeVo> employeeAllData() {
        return sqlSessionFactory.openSession().selectList("employeeAllData");
    }

}
