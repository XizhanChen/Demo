package com.xizhan.dao;

import com.xizhan.entity.Paper;
import org.apache.ibatis.annotations.Param;

import javax.swing.*;
import java.util.List;

/**
 * @author shkstart
 * @create 2022-04-11 14:44
 */
public interface PaperMapper {

    //通过主键查询单个论文
    Paper queryById(@Param("paperid") int paperid);

    //查询所有论文
    List<Paper> queryAll();

    //添加论文,返回所有内容
    // 不可以使用@Param,否则映射文件只能配置paper参数
    void add(Paper paper);

    //根据id删除论文,返回所有内容
    void deleteById(@Param("paperid") int paperid);

    //根据id修改内容
    void updateById(@Param("paperid" ) int paperid, @Param("name") String name, @Param("autor") String autor);



}
