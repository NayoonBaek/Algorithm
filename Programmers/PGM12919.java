package org.example.programmers;

//[프로그래머스] 서울에서 김서방 찾기
//https://school.programmers.co.kr/learn/courses/30/lessons/12919
public class PGM12919 {
    public static String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i <seoul.length ; i++) {
            if(seoul[i].equals("Kim")){
                answer="김서방은 "+i+"에 있다";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String answer = solution(new String[]{"Jane", "Kim"});
        System.out.println(answer);
    }
}
