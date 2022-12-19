package org.example.programmers;

import java.util.Scanner;

//[프로그래머스] 직사각형 별찍기
//https://school.programmers.co.kr/learn/courses/30/lessons/12969
public class PGM12969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <=m ; i++) { // 2. 1부터 i를 1씩 증가하며 반복하기
            for (int j = 1; j <= n; j++) { // 3.  i의 갯수 만큼
                System.out.print("*"); //         별 출력하기
            }
            System.out.println();
        }
    }
}
