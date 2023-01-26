package org.example.programmers;

import java.util.Arrays;

//[프로그래머스] 문자열 내 마음대로 정렬하기
//https://school.programmers.co.kr/learn/courses/30/lessons/12915
public class PGM12915 {
    public static String[] solution(String[] strings, int n) {
        String[] answer = {};
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i+1; j < strings.length; j++) {
                if (strings[i].charAt(n)>(strings[j].charAt(n))) {
                    String tmp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = tmp;
                } else if (strings[i].charAt(n)==(strings[j].charAt(n))) {
                    if (strings[i].compareTo(strings[j]) > 0) {
                        String tmp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = tmp;
                    }
                }
            }
        }
        return answer = strings;
    }

    public static void main(String[] args) {
        String[] answer = solution(new String[]{"sun", "bed", "car"}, 1);
        System.out.println(Arrays.toString(answer));
    }
}
