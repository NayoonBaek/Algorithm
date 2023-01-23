package org.example.programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//[프로그래머스] 두 개 뽑아서 더하기
//https://school.programmers.co.kr/learn/courses/30/lessons/68644
public class PGM68644 {
    public static int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> sumArr = new HashSet<>();
        for (int i = 0; i < numbers.length-1 ; i++) {
            for (int j = i+1; j < numbers.length ; j++) {
                sumArr.add((numbers[i]+numbers[j]));
            }
        }
        return answer=sumArr.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] answer = solution(new int[]{5,0,2,7});
        System.out.println(Arrays.toString(answer));
    }
}
