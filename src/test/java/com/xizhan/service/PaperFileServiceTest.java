package com.xizhan.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-04-14 21:04
 */

//配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
@RunWith(SpringJUnit4ClassRunner.class)
//指定spring配置文件位置
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class PaperFileServiceTest {

    @Autowired
    PaperFileService paperFileService;

    @Test
    public void Test(){

        List<String> strings = paperFileService.queryName();

        System.out.println(strings.toString());
    }
}
