package com.xizhan.service;

import com.xizhan.dao.PaperFileMapper;
import com.xizhan.dto.exception.AddException;
import com.xizhan.entity.Paper;
import com.xizhan.entity.PaperFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-04-14 18:23
 */

@Service
@Transactional
public class PaperFileService {

    @Autowired
    PaperFileMapper paperFileMapper;

    /*public AddException addPath(PaperFile paperFile){

        try {
            if (paperFileMapper.queryAllKey().indexOf("paperFile.getName()") > -1) {

                paperFileMapper.addByName(paperFile);
            } else {
                throw new RepeatAddException("repeat add");
            }
        } catch (RepeatAddException e) {
            throw e;
        }
    }*/

    public List<String> queryName() {

        return paperFileMapper.queryAllKey();

    }

    //判断某元素是否已经存在于name属性中
    public void addPath(PaperFile paperFile) {

        if (paperFileMapper.queryAllKey().indexOf("paperFile.getName()") > -1) {

            paperFileMapper.addByName(paperFile);
            System.out.println("添加成功");
        } else {

            System.out.println("重复添加");
        }

    }

    public String queryPath(String name){

        String path = paperFileMapper.queryByName(name);

        return path;
    }
}
