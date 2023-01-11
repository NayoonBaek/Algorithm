package org.example.programmers;

//[프로그래머스] 완주하지 못한 선수
//https://school.programmers.co.kr/learn/courses/30/lessons/12930
public class PGM12930 {
    public static String solution(String s) {
        String answer = "";
        int num = 1;
        for (int i = 0; i <s.length() ; i++) {
            if(!s.substring(i,i+1).equals(" ")){
                if(num>0){
                    answer += s.substring(i,i+1).toUpperCase();
                    num=-1;
                }else {
                    answer += s.substring(i,i+1).toLowerCase();
                    num=1;
                }
            }else {
                answer += " ";
                num=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String answer = solution("try hello world");
        System.out.println(answer);
    }
}