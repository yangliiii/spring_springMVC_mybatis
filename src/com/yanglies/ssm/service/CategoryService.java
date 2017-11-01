package com.yanglies.ssm.service;

import com.yanglies.ssm.pojo.Category;
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
}
