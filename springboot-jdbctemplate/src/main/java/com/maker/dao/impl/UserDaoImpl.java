package com.maker.dao.impl;

import com.maker.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Auther: 【zhangjian】
 * @Date: 2019/7/27
 * @Description: com.maker.dao.impl
 * @version: 1.0
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Map<String, Object>> queryAll() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from s_menu");
        return maps;
    }
}
