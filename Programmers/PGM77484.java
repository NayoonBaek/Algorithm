package org.example.programmers;

import java.util.Arrays;

//[프로그래머스] 로또의 최고 순위와 최저 순위
//https://school.programmers.co.kr/learn/courses/30/lessons/77484
public class PGM77484 {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int zeroCnt=0;
        for (int i : lottos) {
            if(i==0){
                zeroCnt++;
                continue;
            }
            for (int j : win_nums) {
                if(i==j) cnt++;
            }
        }
        answer[0]= getGrade(zeroCnt+cnt);
        answer[1]=getGrade(cnt);
        return answer;
    }

    private static int getGrade(int n) {
        switch (n) {
            case 6 :
                return 1;
            case 5 :
                return 2;
            case 4 :
                return 3;
            case 3 :
                return 4;
            case 2 :
                return 5;
            default :
                return 6;
        }
    }

    public static void main(String[] args) {
        int[] answer = solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25});
        System.out.println(Arrays.toString(answer));
    }
}
