package com.xizhan.dao;

import com.xizhan.entity.PaperFile;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-04-14 18:16
 */
public interface PaperFileMapper {

    /*根据name添加path*/
    void addByName(PaperFile paperFile);

    //查询所有主键
    List<String> queryAllKey();

    //根据name查询path
    String queryByName(String name);

}

