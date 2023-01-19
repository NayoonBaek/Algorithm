package org.example.programmers;

//[프로그래머스] 3진법 뒤집기
//https://school.programmers.co.kr/learn/courses/30/lessons/68935
public class PGM68935 {
    public static int solution(int n) {
        int answer = 0;
        String num="";
        while (n>2){
            num+=Integer.toString(n%3);
            n/=3;
        }
        num+=Integer.toString(n);

        for (int i = 0; i <num.length() ; i++) {
            answer+=Integer.parseInt(num.substring(num.length()-i-1,num.length()-i))*Math.pow(3,i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int answer = solution(125);
        System.out.println(answer);
    }
}
