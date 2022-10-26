package com.example.todoserver.service;

import com.example.todoserver.domain.Todo;
import com.example.todoserver.mapper.TodoMapper;
import com.example.todoserver.web.dto.TodoInsertDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.rmi.AlreadyBoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TodoService {
    private final TodoMapper todoMapper;

    public String getTime() {
        log.info("현재 시각을 조회합니다.");
        return todoMapper.getTime();
    }

    public List<Todo> getListAll() {
        log.info("list를 전부 조회합니다");
        return todoMapper.getListAll();
    }

    public void register(TodoInsertDTO dto) {
        Todo insertTodo = Todo.builder()
                .title(dto.getTitle())
                .build();

        int result = todoMapper.insert(insertTodo);

        // 정상적으로 insert되지 않은 경우.
        if (result != 1) {
            log.error("insert에 실패하였습니다.");
            return;
        }

        log.info("insert가 완료되었습니다 todo-> " + insertTodo);
    }
}
