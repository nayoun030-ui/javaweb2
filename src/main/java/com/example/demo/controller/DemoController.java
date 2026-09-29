package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.domain.TestDB;
import com.example.demo.model.service.TestService; // 최상단 서비스 클래스 연동 추가

@Controller // 컨트롤러 어노테이션 명시
public class DemoController {

    @Autowired
    TestService testService; // DemoController 클래스 아래 객체 주입

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

    // 4주차 데이터베이스 테스트
    @GetMapping("/testdb")
    public String getAllTestDBs(Model model) {
        // 기존 코드 : 1명 조회
        // TestDB test = testService.findByName("홍길동");
        // model.addAttribute("data4", test);
        // System.out.println("데이터 출력 디버그 : " + test);

        // 다수 사용자 출력
        List<TestDB> users = testService.findAll();
        model.addAttribute("users", users);
        System.out.println("데이터 출력 디버그 : " + users);
        return "testdb";
    }
}
