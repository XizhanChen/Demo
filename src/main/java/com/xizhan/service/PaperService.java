package com.xizhan.service;

import com.xizhan.dao.PaperMapper;
import com.xizhan.entity.Paper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author xizhan
 * @create 2022-04-11 22:55
 */

@Service
@Transactional
public class PaperService {

    @Autowired
    PaperMapper paperMapper;


    public Paper queryById(int id){

        return paperMapper.queryById(id);
    }


    public List<Paper> quqeryAll(){

        return paperMapper.queryAll();
    }


    public void addPaper(Paper paper){

        paperMapper.add(paper);
    }


    public void deleteById(int id){

        paperMapper.deleteById(id);
    }


    public void updateById(int id,String name,String autor){

        paperMapper.updateById(id,name,autor);
    }
}
