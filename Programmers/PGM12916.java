package org.example.programmers;

//[프로그래머스] 문자열 내 p와 y의 개수
//https://school.programmers.co.kr/learn/courses/30/lessons/12916
public class PGM12916 {
    static boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        for (int i = 0; i <s.length() ; i++) {
            char x =s.charAt(i);
            if(x=='p'||x=='P'){
                p++;
            }else if(x=='y'||x=='Y'){
                y++;
            };
        }
        if(p!=y){
            answer=false;
        }
        return answer;
    }

    public static void main(String[] args) {
        boolean answer = solution("pPoooyY");
        System.out.println(answer);
    }
}
