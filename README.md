# appdevelop
2022-11-26 06:30
기존에 발생하더 onFailure 오류를 장고서버 확인 결과 emotion경로안에 emotion파일이 하나 더 있었고 그 안에 int형태의 값을 넣을 수 있느 구조였어서
baseURL을 emotion/emotion/으로 설정하니 onFailure 오류는 발생하지 않았지만 텍스트뷰에 출력시킬려 할때마다 앱이 종료되거나 메뉴로 튕김
텍스트 뷰에 출력하는부분
1.1.5버전 방식(Log.d) 사용 안해봄

Quest_Emotion클래스에서 Django_Item을 call로 선언하고 Django_Item클래스에 있는toString함수 사용해 출력시도 => 실패

Django_Item클래스에 인자값을 그대로 반환하는 get함수들 만들고 result에 body값을 넣음
onResponse함수 안에서 str 선언하고 그 str에 result.get함수들 사용해서 출력시도 => 실패

 Django_Client라는 레트로핏 인터페이스 생성자 클래스 만들고 Quest_Emotion에서 Django_Client생성자 이용해서 레트로핏 생성 후 출력시도 => 실패

==================================================================================

2022-11-24 03:36
emotion 레이아웃과 자바클래스 완성
장고 api 연동 중

해결해야 할 것
장고에서 데이터 받아올때 생기는 오류(onFailure : java.lang.IllegalStateException: Expected BEGIN_OBJECT but was BEGIN_ARRAY at line 1 column 2 path) 해결하기

----------------------------------------------------------------------------------

2022-11-23 03:55 구현한 내용
모든 레이아웃 디자인 수정 


앞으로 해야할 것.
1. Rest Api 연동해서 quest 레이아웃 구현
2. TFLite 연동해서 실시간 소리감지 시스템 구현
