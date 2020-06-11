package com.example.demo.test.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper {

    // 쿼리를 분리한 메소드
    Map<String, Object> selectMessage();
}