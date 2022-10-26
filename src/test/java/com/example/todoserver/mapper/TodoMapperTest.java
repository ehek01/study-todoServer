package com.example.todoserver.mapper;

import com.example.todoserver.domain.Todo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
class TodoMapperTest {

    @Autowired
    private TodoMapper todoMapper;

    @Test
    void getTime() {
        String time = todoMapper.getTime();
        System.out.println("@@@@@@@@@@@@@@@@@2" + time);
    }

    @Test
    @DisplayName("list 를 전부 조회합니다.")
    void getListAll() {
        todoMapper.getListAll()
                .forEach(System.out::println);
    }

    @Test
    @DisplayName("todo를 추가합니다")
    void insert() {
        Todo insertTodo = Todo.builder()
                .title("test 할일제목1")
                .build();

        todoMapper.insert(insertTodo);
    }
}