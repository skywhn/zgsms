package com.whn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 学生
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;
    private String stuNo;
    private String stuName;
    private String stuIdNumber;
    private Teacher teacher;
    private Major major;
}
