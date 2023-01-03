package com.whn.mapper;

import com.whn.BaseTest;
import com.whn.pojo.Course;
import com.whn.utils.MapperUtil;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CourseMapperTest extends BaseTest {
    @Autowired
    CourseMapper courseMapper;

    @Test
    public void testFindCourseById() {
        Course course = courseMapper.findCourseById(1);
        System.out.println(course);
    }
}