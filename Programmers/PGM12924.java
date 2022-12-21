package org.example.programmers;

//[프로그래머스] 숫자의 표현
//https://school.programmers.co.kr/learn/courses/30/lessons/12924
public class PGM12924 {
    public static int solution(int n) {
        int answer = 1;
        for (int i = 1; i < n / 2 + 3; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += j;
                if (n == sum) {
                    answer++;
                } else if (sum > n) {
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int answer = solution(15);
        System.out.println(answer);
    }
}
