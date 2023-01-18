package org.example.programmers;

//[프로그래머스] 하샤드 수
//https://school.programmers.co.kr/learn/courses/30/lessons/12947
public class PGM12947 {
    public static boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        int num = x;
        while (num>0) {
            sum += num % 10;
            num /= 10;
        }
        if(x%sum==0) answer = true;
        return answer;
    }

    public static void main(String[] args) {
        boolean answer = solution(11);
        System.out.println(answer);
    }
}
