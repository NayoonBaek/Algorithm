package org.example.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//[프로그래머스] 같은 숫자는 싫어
//https://school.programmers.co.kr/learn/courses/30/lessons/12906
public class PGM12906 {
    public static int[] solution(int []arr) {
        int cnt = 1;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i-1]!=arr[i]){
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        answer[0]=arr[0];
        cnt=1;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i-1]!=arr[i]){
              answer[cnt]=arr[i];
              cnt++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] answer = solution(new int[]{1,1,3,3,0,1,1});
        System.out.println(Arrays.toString(answer));
    }
}
