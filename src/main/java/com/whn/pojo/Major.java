package com.whn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 专业
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Major {
    private Integer id;
    private String majorName;
    private Department department;
    private List<Course> courseList;
    /**
     * 课时，单位：小时
     */
    private Float teachTime;
}
