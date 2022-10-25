package com.example.todoserver.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoMapper {
    String getTime();
}
