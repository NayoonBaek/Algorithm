package org.example.programmers;

//[프로그래머스] 수박수박수박수박수박수?
//https://school.programmers.co.kr/learn/courses/30/lessons/12922
public class PGM12922 {
    public static String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += i % 2 == 0 ? "수" : "박";
        }
        return answer;
    }

    public static void main(String[] args) {
        String answer = solution(3);
        System.out.println(answer);
    }
}
