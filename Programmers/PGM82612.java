package org.example.programmers;

//[프로그래머스] 부족한 금액 계산하기
//https://school.programmers.co.kr/learn/courses/30/lessons/82612
public class PGM82612 {
    public static long solution(int price, int money, int count) {
        long answer = money;
        for (int i = 1; i < count+1 ; i++) {
            answer-= price*i;
        }
        if(answer>=0){
            answer = 0;
        }else{
            answer = -(answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        long answer = solution(3, 20, 4);
        System.out.println(answer);
    }
}
