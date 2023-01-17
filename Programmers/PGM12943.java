package org.example.programmers;

//[프로그래머스] 콜라츠 추측
//https://school.programmers.co.kr/learn/courses/30/lessons/12943
public class PGM12943 {
    public static int solution(int num) {
        int answer = 0;
        long number = num;
        while (number!=1){
            if(number%2 ==0){
                number /=2;
                answer++;
            }else {
                number = number*3+1;
                answer++;
            }
            if(answer==500) return answer=-1;
        }
        return answer;
    }

    public static void main(String[] args) {
        int answer = solution(626331);
        System.out.println(answer);
    }
}
