package com.example.todoserver.service;


import com.example.todoserver.domain.Todo;
import com.example.todoserver.mapper.TodoMapper;
import com.example.todoserver.web.dto.TodoInsertDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TodoService {
    private final TodoMapper todoMapper;

    public String getTime() {
        return todoMapper.getTime();
    }

    public Integer register(TodoInsertDTO dto) {
        log.info("Todo를 등록합니다. client로부터 전달받은 reqDTO => " + dto);
        return todoMapper.insert(dto);
    }

    public List<Todo> getListAll() {
        log.info("list 전체를 조회합니다");
        return todoMapper.getListAll();
    }
}
