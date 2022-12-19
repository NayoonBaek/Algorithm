package org.example.programmers;

//[프로그래머스] 몫 구하기
//https://school.programmers.co.kr/learn/courses/30/lessons/120805
public class PGM120805 {
        public static int solution(int num1, int num2) {
            int answer = num1%num2;
            return answer;
        }

    public static void main(String[] args) {
        int answer = solution(9,5);
        System.out.println(answer);
    }
}
