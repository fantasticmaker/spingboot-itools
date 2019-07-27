package com.maker.controller;

import com.maker.service.UserService;
import com.maker.service.impl.UserServiceImpl;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Auther: 【zhangjian】
 * @Date: 2019/7/27
 * @Description: com.maker.controller
 * @version: 1.0
 */
@Controller
public class userController {

    @Autowired
    private UserServiceImpl service;

    @RequestMapping("/queryAll")
    @ResponseBody
    public String queryAll() {
        List<Map<String, Object>> maps = service.queryAll();
        JSONArray jsonarray = JSONArray.fromObject(maps);
        return jsonarray.toString();

    }
}
