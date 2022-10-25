package com.example.todoserver.web.api;


import com.example.todoserver.domain.Todo;
import com.example.todoserver.mapper.TodoMapper;
import com.example.todoserver.service.TodoService;
import com.example.todoserver.web.dto.TodoInsertDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class TodoApiController {
    private final TodoService todoService;

    @GetMapping("/time")
    public ResponseEntity<String> getTime() {
        return ResponseEntity.ok().body(todoService.getTime());
    }

    @PostMapping("/todo/add")
    public ResponseEntity<Integer> addTodo(@RequestBody TodoInsertDTO dto) {
        return ResponseEntity.ok().body(todoService.register(dto));
    }

    @GetMapping("/todo/listall")
    public ResponseEntity<List<Todo>> getListAll() {
        return ResponseEntity.ok().body(todoService.getListAll());
    }
}
