package com.yanglies.ssm.controller;

import com.yanglies.ssm.pojo.Category;
import com.yanglies.ssm.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sun.util.resources.cldr.teo.CalendarData_teo_KE;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * lies, please leave something
 *
 * @author lies
 * @Createdon 2017/11/1 11:10.
 * @ProjectName spring_springMVC_mybatis
 */
@Controller
@RequestMapping("")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("listCategory")
    public ModelAndView listCategory(){
        ModelAndView mv = new ModelAndView();
        List<Category> categories = categoryService.list();

        //放入转发参数
        mv.addObject("categories",categories);
        //放入jsp路径
        mv.setViewName("listCategory");

        return mv;
    }
}
