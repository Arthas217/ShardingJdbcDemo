package com.burning.shardingjdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.burning.shardingjdbc.po.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 会游泳的蚂蚁
 * @description: mybatis-plus的mapper
 * @date 2023/12/14 22:39
 */
@Repository
public interface CourseMapper extends BaseMapper<Course> {

}
