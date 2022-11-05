package org.example.programmers;

//[프로그래머스] 짝수와 홀수
//https://school.programmers.co.kr/learn/courses/30/lessons/12937
public class PGM12937 {
    public static String solution(int num) {
        return num%2==0? "Odd":"Even";
    }

    public static void main(String[] args) {
        String answer=solution(-3);
        System.out.println(answer);
    }
}
