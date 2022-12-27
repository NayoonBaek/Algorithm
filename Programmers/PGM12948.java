package org.example.programmers;

//[프로그래머스] 핸드폰 번호 가리기
//https://school.programmers.co.kr/learn/courses/30/lessons/12948
public class PGM12948 {
    public static String solution(String phone_number) {
        String answer = "";
        for (int i = 0; i <phone_number.length()-4 ; i++) {
            answer +="*";
        }
        answer += phone_number.substring(phone_number.length()-4);
        return answer;
    }

    public static void main(String[] args) {
        String answer = solution("01033334444");
        System.out.println(answer);
    }
}
