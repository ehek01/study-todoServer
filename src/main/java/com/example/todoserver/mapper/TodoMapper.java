package com.example.todoserver.mapper;

import com.example.todoserver.domain.Todo;
import com.example.todoserver.web.dto.TodoInsertDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoMapper {
    String getTime();

    Integer insert(TodoInsertDTO dto);

    List<Todo> getListAll();
}
