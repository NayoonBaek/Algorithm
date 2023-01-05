package org.example.programmers.ing;

//[프로그래머스] 가운데 글자 가져오기
//https://school.programmers.co.kr/learn/courses/30/lessons/12903
public class PGM12903 {
    public static String solution(String s) {
        String answer = "";

//        answer = s.substring((s.length()-1)/2, s.length()/2+1);
        if(s.length()%2==0) {
            answer = s.substring(s.length()/2-1, s.length()/2+1);
            return answer;
        } else {
            answer = s.substring(s.length()/2,s.length()/2+1);
            return answer;
        }
    }

    public static void main(String[] args) {
        String answer = solution("abcd");
        System.out.println(answer);
    }
}
