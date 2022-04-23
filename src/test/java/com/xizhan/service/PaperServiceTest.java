package com.xizhan.service;

import com.xizhan.entity.Paper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-04-11 23:02
 */

//配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
@RunWith(SpringJUnit4ClassRunner.class)
//指定spring配置文件位置
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class PaperServiceTest {

    @Autowired
    PaperService paperService;

    @Test
    public void queryByIdST(){

        Paper paper = paperService.queryById(1);

        System.out.println(paper);
    }

    @Test
    public void queryAllST(){

        List<Paper> papers = paperService.quqeryAll();

        System.out.println(papers);
    }

    @Test
    public void addPaperST(){

        paperService.addPaper(new Paper(9,"土豆","陈"));

        System.out.println(paperService.quqeryAll());
    }

    @Test
    public void delectByIdST(){

        paperService.deleteById(1);

        System.out.println(paperService.quqeryAll());
    }

    @Test
    public void updateBuIdST(){

        paperService.updateById(3,"玉米","文琪");

        System.out.println(paperService.quqeryAll());
    }

    @Test
    public void pulltest(){

      
    }
}
