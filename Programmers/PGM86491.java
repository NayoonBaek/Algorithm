package org.example.programmers;

//[프로그래머스] 최소직사각형
//https://school.programmers.co.kr/learn/courses/30/lessons/86491
public class PGM86491 {
    public static int solution(int[][] sizes) {
        int answer = 0;
        int[] max=new int[2];
        int bigger;
        int smaller;
        for (int i = 0; i <sizes.length ; i++) {
            if (sizes[i][0]>sizes[i][1]){
                bigger = sizes[i][0];
                smaller = sizes[i][1];
            }else {
                bigger = sizes[i][1];
                smaller = sizes[i][0];
            }
            if(bigger>max[0]){
                max[0]=bigger;
            }
            if(smaller>max[1]){
                max[1]=smaller;
            }
        }
        return answer = max[0]*max[1];
    }

    public static void main(String[] args) {
        int answer = solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
        System.out.println(answer);
    }
}
