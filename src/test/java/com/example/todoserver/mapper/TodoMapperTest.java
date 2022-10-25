package com.example.todoserver.mapper;

import com.example.todoserver.domain.Todo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class TodoMapperTest {

    @Autowired
    private TodoMapper todoMapper;

    @Test
    void getTime() {
        String time = todoMapper.getTime();
        System.out.println("@@@@@@@@@@@@@@@@@2" + time);
        Assertions.assertNotNull(time);
    }

    @Test
    @DisplayName("리스트 전체조회")
    void getListAll() {
        List<Todo> todoList = todoMapper.getListAll();
        Assertions.assertNotNull(todoList);
    }
}