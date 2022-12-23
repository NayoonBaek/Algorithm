package org.example.programmers;

//[프로그래머스] 없는 숫자 더하기
//https://school.programmers.co.kr/learn/courses/30/lessons/86051
public class PGM86051 {
    public static int solution(int[] numbers) {
        int answer = 45;
        for(int i=0;i< numbers.length;i++){
            answer-=numbers[i];
        }
        return answer;
    }

    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,6,7,8,0};
        int answer = solution(new int[]{1,2,3,4,6,7,8,0});
        System.out.println(answer);
    }
}
