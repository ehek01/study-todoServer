package com.example.todoserver.web.api;

import com.example.todoserver.domain.Todo;
import com.example.todoserver.service.TodoService;
import com.example.todoserver.web.dto.TodoInsertDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
@RequiredArgsConstructor
@Slf4j
public class TodoApiController {
    private final TodoService todoService;

    @GetMapping("/listall")
    public ResponseEntity<List<Todo>> getListAll() {
        return ResponseEntity.ok().body(todoService.getListAll());
    }

    @PostMapping("/add")
    public void addTodo(@RequestBody TodoInsertDTO dto) {
        todoService.register(dto);
    }
}
