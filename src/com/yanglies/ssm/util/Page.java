package com.yanglies.ssm.util;

/**
 * lies, please leave something
 *  用于分页。。。
 * @author lies
 * @Createdon 2017/11/1 17:08.
 * @ProjectName spring_springMVC_mybatis
 */
public class Page {
    private int start = 0;  //开始位置
    private int count = 5;  //每页的个数
    private int last = 0;   //最后一页的位置

    //计算最后一页的位置,通过总数total和每页的个数count来进行确认
    public void caculateLast(int total){
//        last = total % count == 0 ? total-count : total-total%count;
        if(0 == total % count){
            last = total - count;
        }else {
            last = total - total % count;
        }
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }
}
