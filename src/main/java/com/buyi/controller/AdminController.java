package com.buyi.controller;

import com.buyi.entity.Admin;
import com.buyi.mapper.AdminMapper;
import com.buyi.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.List;

/**
 * Created by 1132989278@qq.com on 2018/11/5 16:38
 */
//@RestController
public class AdminController {

    private static Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private JavaMailSender sender;

    @Autowired
    private MailProperties mailProperties;

    @Autowired
    private TestService testService;

    @Autowired
    private AdminMapper adminMapper;

    @RequestMapping("/admins/{id}")
    public Admin getOne(@PathVariable Integer id){
        Admin one = adminMapper.getOne(id);
        logger.info(one.getName());
        return one;
    }

    @RequestMapping("/admins/{id}/send-mail")
    public Admin sendMail(@PathVariable Integer id) throws MessagingException {
        Admin one = adminMapper.getOne(id);
        logger.error(one.getName());

        //sending mail
        MimeMessage mimeMessage = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
        String username = mailProperties.getUsername();
        helper.setFrom("buyi <"+username+">");
        helper.setSubject("hello spring boot!");
        helper.setTo("2769099689@qq.com");
        helper.setText("this is a test for spring boot sending mail!" +
                one);
        sender.send(mimeMessage);


        return one;
    }


    @RequestMapping("/admins")
    public Iterable<Admin> getAll(){
        return adminMapper.getAll();
    }

    @RequestMapping("/admins/test")
    public void test(){
//        Admin b = adminMapper.getOneByName("buyi");
//
//        List<Admin> rs1 = adminMapper.getAllByName("buyi");
//        List<Admin> rs2 = adminMapper.getAllByName("bu");
//        List<Admin> rs3 = adminMapper.getAllByName("bu");

        testService.getString("gseg");
        System.out.println();
    }
}
