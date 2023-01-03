package com.whn.mapper;

import com.whn.pojo.Course;
import org.apache.ibatis.annotations.Param;

public interface CourseMapper {
    Course findCourseById(@Param("courseId") Integer courseId);
}
