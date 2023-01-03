package com.whn.utils;

import com.whn.mapper.StudentMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapperUtil {
    public static <T> T getMapperImpl(Class<T> tClass){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        return applicationContext.getBean(tClass);
    }
}
