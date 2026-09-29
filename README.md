# 자바웹프로그래밍(2) - 20250590 김나연

## 2주차 스프링 부트 개발환경, 테스트 완료
- 개발 환경 : VS Code + Spring Boot 4.1.1 + Java 25 (Maven, Jar)
- [index_backup.html : 2주차 메인화면 실행/수정 완료](https://github.com/nayoun030-ui/javaweb2/blob/main/src/main/resources/templates/index_backup.html)
- [DemoController.java : /hello, /hello2 URL 매핑 추가](https://github.com/nayoun030-ui/javaweb2/blob/main/src/main/java/com/example/demo/DemoController.java)
- [hello.html : model 데이터 출력](https://github.com/nayoun030-ui/javaweb2/blob/main/src/main/resources/templates/hello.html)
- [hello2.html : 연습문제 - 5개 속성 출력](https://github.com/nayoun030-ui/javaweb2/blob/main/src/main/resources/templates/hello2.html)
- [pom.xml : DB 관련 의존성 주석 처리](https://github.com/nayoun030-ui/javaweb2/blob/main/pom.xml)

## 3주차 포트폴리오 작성하기 완료
- 템플릿 : TemplateMo 578 First Portfolio (Bootstrap 5.1.3)
- [index.html : 실행/수정 완료](https://github.com/nayoun030-ui/javaweb2/blob/main/src/main/resources/templates/index.html)
  - 자원 경로 타임리프 `th:href="@{...}"`, `th:src="@{...}"` 로 변경
  - 메뉴 한글화 (홈페이지 / 소개 / 기술 / 프로젝트 / 연락처), 프로필 수정
  - 기술 영역 4가지 : 웹, AI, 앱, 디자인 (아이콘 bi-globe, bi-anthropic, bi-phone, bi-palette)
  - 폼 버그 수정 : `label`의 `for`와 `input`의 `id` 불일치
- [templatemo-first-portfolio-style.css : 한글 메뉴 폰트 크기 수정](https://github.com/nayoun030-ui/javaweb2/blob/main/src/main/resources/static/css/templatemo-first-portfolio-style.css)
- [public 폴더 : 기술 상세 페이지 4개](https://github.com/nayoun030-ui/javaweb2/tree/main/src/main/resources/public)
  - detailed_web.html, detailed_ai.html, detailed_app.html, detailed_design.html
