package org.example.programmers;

//[프로그래머스] 음양 더하기
//https://school.programmers.co.kr/learn/courses/30/lessons/76501
public class PGM76501 {

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i <absolutes.length ; i++) {
            if(signs[i]){
                answer += absolutes[i];
            }else{
                answer -= absolutes[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int answer = solution(new int[]{4,7,12}, new boolean[]{true,false,true});
        System.out.println(answer);
    }
}
