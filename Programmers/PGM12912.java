package org.example.programmers;

//[프로그래머스] 두 정수 사이의 합
//https://school.programmers.co.kr/learn/courses/30/lessons/12912
public class PGM12912 {
    public static long solution(int a, int b) {
        long answer = 0;
        int i = 0;
        if(a<b){
            for (i=a; i<=b; i++)
                answer +=i;
        }else{
            for (i = b; i <= a; i++) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        long answer = solution(3,5);
        System.out.println(answer);
    }
}
