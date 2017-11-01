package com.yanglies.ssm.pojo;

/**
 * lies, please leave something
 *
 * @author lies
 * @Createdon 2017/11/1 10:54.
 * @ProjectName spring_springMVC_mybatis
 */
public class Category {
    private int id;
    private  String name;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
