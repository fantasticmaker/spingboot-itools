package com.maker.service.impl;

import com.maker.dao.impl.UserDaoImpl;
import com.maker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Auther: 【zhangjian】
 * @Date: 2019/7/27
 * @Description: com.maker.service.impl
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoImpl dao;

    @Override
    public List<Map<String, Object>> queryAll() {
        return dao.queryAll();
    }
}
