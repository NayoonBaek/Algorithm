package org.example.programmers;

//[프로그래머스] 문자열 다루기 기본
//https://school.programmers.co.kr/learn/courses/30/lessons/12918
public class PGM12918 {
    public static boolean solution(String s) {
        boolean answer = true;
        if(s.length()==4|| s.length()==6 ){
            for (int i = 0; i <s.length() ; i++) {
                if(s.charAt(i)<'0' || s.charAt(i)>'9'){
                    return answer= false;
                }
            }
        }else {
            return answer= false;
        }
        return answer;
    }

    public static void main(String[] args) {
        boolean answer = solution("a234");
        System.out.println(answer);
    }
}
