/*
package com.qf.web;

import com.qf.DAO.UserDAO;
import com.qf.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Testmybatis {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession sqlSession = sqlSessionFactory.openSession(true);

            UserDAO mapper = sqlSession.getMapper(UserDAO.class);

            List<User> users = mapper.queryAll();
            User user = mapper.queryOne(20);
            User user1 = mapper.queryOne(10);

            // 如果使用jdbc-template的话，query会返回多条，要对这个集合做长度校验
            // 如果使用jdbc-template的话，queryFoObject会可能抛异常

            System.out.println(users);
            System.out.println(user);
            System.out.println(user1);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
*/
