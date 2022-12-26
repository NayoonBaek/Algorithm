package org.example.programmers;

//[프로그래머스] 평균 구하기
//https://school.programmers.co.kr/learn/courses/30/lessons/12944
public class PGM12944 {
    public static double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for (int i : arr) {
            sum+= i;
        }
        answer = sum/arr.length;
        return answer;
    }
    public static void main(String[] args) {
        double answer = solution(new int[]{1,2,3,4});
        System.out.println(answer);
    }
}
