package org.example.programmers;

//[프로그래머스] 정수 제곱근 판별
//https://school.programmers.co.kr/learn/courses/30/lessons/12934
public class PGM12934 {
    public static long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
        if(sqrt==(long)sqrt){
            answer = (long) Math.pow(sqrt+1,2);
        }else{
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        long answer = solution(121);
        System.out.println(answer);
    }
}
