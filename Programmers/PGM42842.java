package org.example.programmers;

import java.util.Arrays;

//[프로그래머스] 카펫
//https://school.programmers.co.kr/learn/courses/30/lessons/42842
public class PGM42842 {
    public static int[] solution(int brown, int yellow) {
        int[] answer=new int[2];
        for (int i = 3; i < 2500; i++) {
            for (int j = 3; j <=i ; j++) {
                if(i*j==brown+yellow && (i-2)*(j-2)==yellow){
                    answer[0] = i;
                    answer[1]=j;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] answer = solution(24,24);
        System.out.println(Arrays.toString(answer));
        System.out.println(answer);
    }
}
