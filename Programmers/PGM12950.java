package org.example.programmers;

import java.util.Arrays;

//[프로그래머스] 행렬의 덧셈
//https://school.programmers.co.kr/learn/courses/30/lessons/12950
public class PGM12950 {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] answer =  solution(new int[][]{{1,2},{2,3}},new int[][]{{3,4},{5,6}});
            System.out.println(Arrays.deepToString(answer));
    }
}
