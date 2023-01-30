package org.example.programmers;

import java.util.HashMap;

//[프로그래머스] 숫자 문자열과 영단어
//https://school.programmers.co.kr/learn/courses/30/lessons/81301
public class PGM81301 {
    public static int solution(String s) {
        int answer = 0;
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i <arr.length ; i++) {
            s =s.replace(arr[i], Integer.toString(i));
        }
        return answer = Integer.parseInt(s);
    }

    public static void main(String[] args) {
        int answer = solution("one4seveneight");
        System.out.println(answer);
    }
}
