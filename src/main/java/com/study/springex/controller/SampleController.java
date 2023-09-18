package com.study.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
@Log4j2
public class SampleController {

    @GetMapping("/hello")
    public void hello() {
        log.info("hello...........");
    }

    // 예를 들어 /ex1?name=AAA&age=16 호출 시 자동으로 처리된다.
    @GetMapping("/ex1")
    public void ex1(String name, int age) {
        log.info("ex1........");
        log.info("name: " + name);
        log.info("age: " + age);
    }

    // defaultValue? 전달된 파라미터 없을 때 기본값 지정하기
    @GetMapping("/ex2")
    public void ex2(@RequestParam(name = "name", defaultValue = "AAA") String name,
                    @RequestParam(name = "age", defaultValue = "20") int age) {
        log.info("ex2..........");
        log.info("name: " + name);
        log.info("age: " + age);

    }

    @GetMapping("/ex3")
    public void ex3(LocalDate dueDate) {
        log.info("ex3..........");
        log.info("dueDate: " + dueDate);
    }

}
