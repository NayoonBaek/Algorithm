package org.example.programmers;

import java.lang.reflect.Array;
import java.util.Arrays;

//[프로그래머스] 자연수 뒤집어 배열로 만들기
//https://school.programmers.co.kr/learn/courses/30/lessons/12932
public class PGM12932 {
    public static int[] solution(long n) {
        String num = Long.toString(n);
        int[] answer = new int[num.length()];
        for (int i = 0; i <num.length() ; i++) {
            answer[i]=Integer.parseInt(num.substring(num.length()-i-1, num.length()-i));
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] answer = solution(12345);
        System.out.println(Arrays.toString(answer));
    }
}
