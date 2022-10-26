package com.example.todoserver.web.api;

import com.example.todoserver.service.TodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class TimeApi {
    private final TodoService todoService;

    @GetMapping("/time")
    @CrossOrigin
    public ResponseEntity<String> getTime() {
        log.info("시간을 조회합니다.");
        return ResponseEntity.ok().body(todoService.getTime());
    }

}
