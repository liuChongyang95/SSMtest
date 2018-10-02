package com.learn.ssm.main;

import com.learn.ssm.mapper.RoleMapper;
import com.learn.ssm.pojo.Role;
import com.learn.ssm.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.io.IOException;

public class MainPro {
    public static void main(String[] args){
        Logger logger= Logger.getLogger(MainPro.class);
        SqlSession sqlSession=null;
        try{
            sqlSession= SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper=sqlSession.getMapper(RoleMapper.class);
            Role role=roleMapper.getRole(1L);
            logger.info(role.getRoleName());
        } finally {
            sqlSession.close();
        }
    }
}
