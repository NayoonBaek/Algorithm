package org.example.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.sort;

//[프로그래머스] 나누어 떨어지는 숫자 배열
//https://school.programmers.co.kr/learn/courses/30/lessons/12910
public class PGM12910 {
    public static int[] solution(int[] arr, int divisor) {

        List<Integer> list= new ArrayList<>();
        for (int i : arr) {
            if(i%divisor==0) list.add(i);

        }
        if(list.isEmpty()) {
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size() ; i++) {
            answer[i]= list.get(i);
        }

        /*sol2*/
//        int count = 0;
//        int num = 0;
//        for (int i : arr) {
//            if(i%divisor == 0){
//                count++;
//            }
//        }
//        if(count == 0){
//            int[] answer = {-1};
//            return answer;
//        }
//        int[] answer = new int[count];
//        for (int i : arr) {
//            if(i%divisor == 0){
//                answer[num]=i;
//                num++;
//            }
//        }
        Arrays.sort(answer);
        return answer;

        /*sol3*/
//        return Arrays.stream(arr).filter(r->r%divisor==0).sorted().toArray();
    }

    public static void main(String[] args) {
        int[] answer = solution(new int[]{2, 36, 1, 3}, 1);
        System.out.println(Arrays.toString(answer));
    }
}
