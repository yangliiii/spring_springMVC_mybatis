package com.yanglies.ssm.test;

import com.yanglies.ssm.mapper.CategoryMapper;
import com.yanglies.ssm.pojo.Category;
import com.yanglies.ssm.util.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * lies, please leave something
 *
 * @author lies
 * @Createdon 2017/11/1 17:30.
 * @ProjectName spring_springMVC_mybatis
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSSM {

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void add(){
        for (int i = 0; i < 123; i++) {
            Category category = new Category();
            category.setName("测试分页" + i);
            categoryMapper.add(category);
        }
        System.out.println("完成测试数据插入！");
    }

    @Test
    public void total(){
        System.out.println(categoryMapper.total());
    }

    @Test
    public void list(){
        Page page = new Page();
        page.setCount(5);
        page.setStart(0);

        List<Category> categoryList = categoryMapper.list(page);
        for (Category c :
                categoryList) {
            System.out.println(c);
        }
    }
}
