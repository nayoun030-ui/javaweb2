package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 컨트롤러 어노테이션 명시
public class DemoController {

    @GetMapping("/hello") // 전송 방식 GET
    public String hello(Model model) {
        model.addAttribute("data", " 반갑습니다."); // model 설정
        return "hello"; // hello.html 연결
    }

    // 2주차 연습문제 : /hello2 매핑 + 5개 속성 추가
    @GetMapping("/hello2")
    public String hello2(Model model) {
        model.addAttribute("name", "김나연");
        model.addAttribute("studentId", "20250590");
        model.addAttribute("major", "미디어소프트웨어학과");
        model.addAttribute("subject", "자바웹프로그래밍(2)");
        model.addAttribute("message", "스프링 부트 개발환경 설정 및 테스트 완료!");
        return "hello2"; // hello2.html 연결
    }
}
