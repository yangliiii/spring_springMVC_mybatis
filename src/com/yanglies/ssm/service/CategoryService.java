package com.yanglies.ssm.service;

import com.yanglies.ssm.pojo.Category;
import com.yanglies.ssm.util.Page;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * lies, please leave something
 *
 * @author lies
 * @Createdon 2017/11/1 11:08.
 * @ProjectName spring_springMVC_mybatis
 */
@Service
public interface CategoryService {

    List<Category> list();
//    int total();
//    List<Category> list(Page page);
}
