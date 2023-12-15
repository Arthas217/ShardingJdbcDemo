package com.burning.shardingjdbc.po;

import lombok.Data;

import java.util.Date;

/**
 * @author 会游泳的蚂蚁
 * @description:
 * @date 2023/12/14 22:37
 */
@Data
public class Course {
    private Long cid;
    private String name;
    private long userId;
    private String status;
    private Date createTime;
    private Date updateTime;
}
