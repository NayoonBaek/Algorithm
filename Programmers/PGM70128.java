package org.example.programmers;

//[프로그래머스] 내적
//https://school.programmers.co.kr/learn/courses/30/lessons/70128
public class PGM70128 {
    public static int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i <a.length ; i++) {
            answer+=a[i]*b[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int answer = solution(new int[]{1,2,3,4},new int[]{-3,-1,0,2});
        System.out.println(answer);
    }
}
