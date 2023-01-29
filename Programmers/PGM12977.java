package org.example.programmers;

//[프로그래머스] 소수 만들기
//https://school.programmers.co.kr/learn/courses/30/lessons/12977
public class PGM12977 {
    public static int solution(int[] nums) {
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i <nums.length-2 ; i++) {
            for (int j = i+1; j < nums.length-1 ; j++) {
                for (int k = j+1; k < nums.length ; k++) {
                    for (int l = 2; l <(nums[i]+nums[j]+nums[k]); l++) {
                        if(((nums[i]+nums[j]+nums[k])%l)==0){
                            cnt++;
                        }
                    }
                    if(cnt==0) answer++;
                    cnt=0;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int answer = solution(new int[]{1,2,7,6,4});
        System.out.println(answer);
    }
}