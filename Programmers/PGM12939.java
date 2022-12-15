package org.example.programmers;

//[프로그래머스] 최댓값과 최솟값
//https://school.programmers.co.kr/learn/courses/30/lessons/12939
public class PGM12939 {
    public static String solution(String s) {
        String[] arr = s.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        String answer = min + " " + max;
        return answer;
    }

    public static void main(String[] args) {
        String answer = solution("-1 -2 -3 -4");
        System.out.println(answer);
    }
}

