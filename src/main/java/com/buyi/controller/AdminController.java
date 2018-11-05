package com.buyi.controller;

import com.buyi.entity.Admin;
import com.buyi.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/5 16:38
 */
@RestController
public class AdminController {

    @Autowired
    private AdminMapper adminMapper;

    @RequestMapping("/admins/{id}")
    public Admin getOne(@PathVariable Integer id){
        Admin one = adminMapper.getOne(id);
        return one;
    }

    @RequestMapping("/admins")
    public Iterable<Admin> getAll(){
        return adminMapper.getAll();
    }

    @RequestMapping("/admins/test")
    public void test(){
        Admin b = adminMapper.getOneByName("buyi");

        List<Admin> rs1 = adminMapper.getAllByName("buyi");
        List<Admin> rs2 = adminMapper.getAllByName("bu");
        List<Admin> rs3 = adminMapper.getAllByName("bu");
        System.out.println();
    }
}
