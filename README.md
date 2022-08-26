# SpringMVC-Item-Service
스프링 MVC 1편 - 백엔드 웹 개발 핵심 기술 서블릿 예제 part3

</br></br></br>

# 요구사항 분석
* 사용자는 상품명, 가격, 수량을 입력하여 상품을 등록할 수 있다.
* 사용자는 등록한 상품을 수정, 삭제할 수 있다.
* 사용자는 등록된 상품 목록을 조회할 수 있다.
* 사용자는 등록된 상품의 상세 정보를 조회할 수 있다.

</br></br></br>

# API 규격서
| URL | 방식 | 파라미터 | 파라미터 설명 | 설명 |
| ------------- | ------------- | ------------- | ------------- | ------------- | ------------- |
|  / | GET | Model model | List<Item> 정보를 저장할 Model 객체 | 상품 목록 조회 |
| /register | GET | | | 상품 등록 폼 |
| /register | POST | Item item | Item 객체 정보 저장 Model 객체 | 상품 등록 처리 |
| /read/{itemId} | GET | Long itemId, Model model | Item 객체 고유 ID와 Item 객체 정보를 담을 Model 객체 | 상품 글 조회 |
| /modify/{itemId) | GET | Long itemId, Model model | Item 객체 고유 ID와 Item 객체 정보를 담을 Model 객체 | 상품 수정 폼 |
| /modify/{itemId) | POST | Item item | Item 객체 정보 저장 Model 객체 | 상품 수정 처리 |
| /delete/{itemId) | POST | Long itemId | Item 객체 고유 ID | 상품 삭제 처리 |

</br></br></br>

# 구현 화면
## 메인 상품 목록 화면
![image](https://user-images.githubusercontent.com/74942574/186872713-6854ccee-409a-462f-8a22-9919db7f2a39.png)
</br></br>
## 상품 등록 화면
![image](https://user-images.githubusercontent.com/74942574/186872792-4e538185-4a88-4c7f-96e7-7ecbe9503dbd.png)
</br></br>
## 상품 수정 화면
![image](https://user-images.githubusercontent.com/74942574/186872830-5064f9d1-d89a-400d-b03c-d61ad7a54d93.png)

</br></br></br>

# 기술 스택
* Spring Boot
* Thymeleaf
* BootStrap
