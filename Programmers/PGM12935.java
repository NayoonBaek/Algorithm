package org.example.programmers;

import java.util.Arrays;

//[프로그래머스] 제일 작은 수 제거하기
//https://school.programmers.co.kr/learn/courses/30/lessons/12935
public class PGM12935 {
    public static int[] solution(int[] arr) {
        int[] answer;
        int min = arr[0];
        int num=0;
        if(arr.length!=1){
            answer = new int[arr.length-1];
            for (int i = 0; i <arr.length ; i++) {
                if (arr[i] < min) min = arr[i];
            }
            for (int i = 0; i <arr.length ; i++) {
                if(arr[i] != min){
                    answer[num] = arr[i];
                    num++;
                }
            }
        }else {
            answer = new int[1];
            answer[0]=-1;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] answer = solution(new int[]{4,3,2,1});
        System.out.println(Arrays.toString(answer));
    }
}
