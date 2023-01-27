package org.example.programmers;

import java.util.Arrays;

//[프로그래머스] 문자열 내림차순으로 배치하기
//https://school.programmers.co.kr/learn/courses/30/lessons/12917
public class PGM12917 {
    public static String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]<arr[j]){
                    char tmp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        answer = String.valueOf(arr);
        return answer;
    }

    public static void main(String[] args) {
        String answer = solution("Zbcdefg");
        System.out.println(answer);
    }
}
