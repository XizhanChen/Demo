package com.xizhan.dao;

import com.xizhan.entity.Paper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-04-11 15:20
 */

//配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
@RunWith(SpringJUnit4ClassRunner.class)
//指定spring配置文件位置
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class PaperDaoTest {

    //自动装配
    @Autowired
    PaperMapper paperMapper;

    //运行junit进行测试
    @Test

    public void testQueryById(){

        Paper paper = paperMapper.queryById(1);

        System.out.println(paper);
    }

    @Test
    public void testQueryAll(){

        List<Paper> papers = paperMapper.queryAll();

        System.out.println(papers);
    }


    @Test
    public void insertPaper(){

        paperMapper.add(new Paper(4,"胡萝卜","chen"));

        System.out.println(paperMapper.queryAll());
    }

    @Test
    public void delectById(){

        paperMapper.deleteById(100);

        System.out.println(paperMapper.queryAll());
    }

    @Test
    public void updatebuid(){

        paperMapper.updateById(2,"","赵");

        System.out.println(paperMapper.queryAll());
    }

}
