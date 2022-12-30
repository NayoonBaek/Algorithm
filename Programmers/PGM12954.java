package org.example.programmers;

import java.util.Arrays;

//[프로그래머스] x만큼 간격이 있는 n개의 숫자
//https://school.programmers.co.kr/learn/courses/30/lessons/12954
public class PGM12954 {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i <n ; i++) {
            answer[i]=x+ (long) x *i;
        }
        return answer;
    }

    public static void main(String[] args) {
        long[] answer = solution(-4,2);
        System.out.println(Arrays.toString(answer));
    }
}
