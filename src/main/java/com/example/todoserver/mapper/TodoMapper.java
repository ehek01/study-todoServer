package com.example.todoserver.mapper;

import com.example.todoserver.domain.Todo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoMapper {
    String getTime();

    List<Todo> getListAll();

    Integer insert(Todo insertTodo);
}
