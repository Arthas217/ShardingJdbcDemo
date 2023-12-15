package com.burning.shardingjdbc.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.burning.shardingjdbc.po.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author 会游泳的蚂蚁
 * @description:
 * @date 2023/12/14 22:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseMapperTest {

    @Autowired
    private CourseMapper courseMapper;

    /*
     *
     *水平分表
     *
     */
    @Test
    public void addCourse() {
        for (int i = 1; i <= 10; i++) {
            Course course = new Course();
            course.setName("java" + i);
            course.setUserId(100L);
            course.setStatus("Normal" + i);
            courseMapper.insert(course);
        }
    }

    //查询课程的方法
    @Test
    public void findCourse() {
        QueryWrapper<Course> wrapper = new QueryWrapper<>();
//        wrapper.eq("cid", 465114665106538497L);
        wrapper.eq("cid", 942567515601502209L);
        Course course = courseMapper.selectOne(wrapper);
        System.out.println(course);
    }


    /*
     *
     *水平分库分表
     *
     */
    @Test
    public void addCourse2() {
        Course course = new Course();
        course.setName("demo");
        course.setUserId(131L);
        course.setStatus("Normal");
        courseMapper.insert(course);
    }


}