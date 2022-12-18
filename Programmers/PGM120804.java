package org.example.programmers;

//[프로그래머스] 두 수의 곱
//https://school.programmers.co.kr/learn/courses/30/lessons/120804
public class PGM120804 {
    public static int solution(int num1, int num2) {
        int answer = num1*num2;
        return answer;
    }

    public static void main(String[] args) {
        int answer = solution(27,19);
        System.out.println(answer);
    }
}
