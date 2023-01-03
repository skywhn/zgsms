package com.whn.mapper;

import com.whn.pojo.Department;
import com.whn.utils.MapperUtil;
import junit.framework.TestCase;

public class DepartmentMapperTest extends TestCase {

    public void testFindDepartmentById() {
        DepartmentMapper departmentMapper = MapperUtil.getMapperImpl(DepartmentMapper.class);
        Department department = departmentMapper.findDepartmentById(1);
        System.out.println(department);
    }
}