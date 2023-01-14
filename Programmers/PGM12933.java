package org.example.programmers;

import java.util.Arrays;

//[프로그래머스] 정수 내림차순으로 배치하기
//https://school.programmers.co.kr/learn/courses/30/lessons/12933
public class PGM12933 {
    public static long solution(long n) {
        long answer = 0;
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);
        String number="";
        for (int i = 0; i <arr.length ; i++) {
            number += arr[arr.length-1-i];
        }
        answer = Long.parseLong(number);
        return answer;
    }

    public static void main(String[] args) {
        long answer = solution(118372);
        System.out.println(answer);
    }
}
