package com.example.todoserver.service;

import com.example.todoserver.domain.Todo;
import com.example.todoserver.web.dto.TodoInsertDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TodoServiceTest {

    @Autowired
    private TodoService todoService;

    @Test
    void getTime() {
        String time = todoService.getTime();
        System.out.println("@@@@@@@@@@@@" + time);
    }

    @Test
    void getListAll() {
        todoService.getListAll()
                .forEach(System.out::println);
    }

    @Test
    void register() {
        TodoInsertDTO insertTodo = TodoInsertDTO.builder()
                .title("service test 할일제목1")
                .build();

        todoService.register(insertTodo);
    }
}