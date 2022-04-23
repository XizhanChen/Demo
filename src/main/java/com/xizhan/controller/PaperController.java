package com.xizhan.controller;

import com.xizhan.entity.Paper;
import com.xizhan.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

/**
 * @author xizhan
 * @create 2022-04-12 11:20
 */

@Controller
public class PaperController {

    @Autowired
    PaperService paperService;

    @RequestMapping("/")
    public String index(){

        //设置视图名称
        return "index";
    }

    @RequestMapping(value = "/queryall", method = RequestMethod.GET)
    public String queryAllPaper(Model model){

        List<Paper> papers = paperService.quqeryAll();

        model.addAttribute("papers", papers);

        return "paper_list";
    }

    @RequestMapping(value = "/querybyid")
    public String queryById(){

        return "querypaperbyid";
    }


    @RequestMapping(value = "/querybyid/querypaperbyid", method = RequestMethod.GET)
    public String queryPaperById(Model model, Integer paperid){

        Paper papers = paperService.queryById(paperid);

        model.addAttribute("papers", papers);

        return "paperbyid";
    }


    @RequestMapping("/add")
    public String add(){

        return "addpaper";
    }


    @RequestMapping(value = "/add/addpaper",method = RequestMethod.POST)
    public String adddPaper(Paper paper){

        paperService.addPaper(paper);

        return "Up";
    }


    @RequestMapping("/delete")
    public String delete(){

        return "deletepaper";
    }


    @RequestMapping(value = "/delete/deletepaper",method = RequestMethod.DELETE)
    /*在控制器方法的形参位置，设置和请求参数同名的形参*/
    public String deletepaper(Integer paper_id){

        paperService.deleteById(paper_id);


        return "success";
    }


    @RequestMapping(value = "/update")
    public String update(){

        return "updatepaper";
    }


    @RequestMapping(value = "/update/updatepaper", method = RequestMethod.PUT)
    public String updatepaper(Integer paper_id, String name, String autor){

        paperService.updateById(paper_id, name, autor);

        return "success";
    }


}
