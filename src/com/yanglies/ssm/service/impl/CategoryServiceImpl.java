package com.yanglies.ssm.service.impl;

import com.yanglies.ssm.mapper.CategoryMapper;
import com.yanglies.ssm.pojo.Category;
import com.yanglies.ssm.service.CategoryService;
import com.yanglies.ssm.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * lies, please leave something
 *
 * @author lies
 * @Createdon 2017/11/1 11:09.
 * @ProjectName spring_springMVC_mybatis
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> list() {
        return categoryMapper.list();
    }

//    @Override
//    public int total() {
//        return categoryMapper.total();
//    }
//
//    @Override
//    public List<Category> list(Page page) {
//        return categoryMapper.list(page);
//    }
}
