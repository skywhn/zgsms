package com.whn.mapper;

import com.whn.pojo.Department;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
    Department findDepartmentById(@Param("departmentId")Integer departmentId);
}
