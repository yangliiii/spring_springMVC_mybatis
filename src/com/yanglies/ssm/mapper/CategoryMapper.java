package com.yanglies.ssm.mapper;

import com.yanglies.ssm.pojo.Category;
import com.yanglies.ssm.util.Page;

import java.util.List;

/**
 * lies, please leave something
 *
 * @author lies
 * @Createdon 2017/11/1 11:05.
 * @ProjectName spring_springMVC_mybatis
 */
public interface CategoryMapper {
    public void add(Category category);

    public void delete(int id);

    public Category get(int id);

    public void update(Category category);

    public List<Category> list();

    public int count();

    //获取记录总数
    public int total();

    //根据Page来进行分页查询
    public List<Category> list(Page page);
}
