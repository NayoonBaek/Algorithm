package org.example.programmers;

//[프로그래머스] 자릿수 더하기
//https://school.programmers.co.kr/learn/courses/30/lessons/12931
public class PGM12931 {
    public static int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);
        for (int i = 0; i <num.length() ; i++) {
            answer+= Integer.parseInt(num.substring(i,i+1));
        }
        return answer;
    }

    public static void main(String[] args) {
        int answer = solution(987);
        System.out.println(answer);
    }
}
