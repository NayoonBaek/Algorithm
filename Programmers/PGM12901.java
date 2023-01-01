package org.example.programmers;

//[프로그래머스] 2016년
//https://school.programmers.co.kr/learn/courses/30/lessons/12901
public class PGM12901 {
    public static String solution(int a, int b) {
        String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int sum=0;
        for (int i = 0; i < a-1; i++) {
            sum += month[i];
        }
        sum +=b;
        String answer = day[sum%7];
        return answer;
    }

    public static void main(String[] args) {
        String answer = solution(5,24);
        System.out.println(answer);
    }
}
