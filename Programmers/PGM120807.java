package org.example.programmers;

//[프로그래머스] 숫자 비교하기
//https://school.programmers.co.kr/learn/courses/30/lessons/120807
public class PGM120807 {
    public static int solution(int num1, int num2) {
        int answer = 0;
        if (num1 == num2) {
            return answer = 1;
        } else {
            return answer = -1;
        }
    }

    public static void main(String[] args) {
        int answer = solution(2, 3);
        System.out.println(answer);
    }
}
