package com.example.todoserver.web.api;


import com.example.todoserver.mapper.TodoMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class TodoApiController {
    private final TodoMapper todoMapper;

    @GetMapping("/time")
    public ResponseEntity<String> getTime() {
        log.info("시간을 확인합니다.");
        return ResponseEntity.ok().body(todoMapper.getTime());
    }
}
