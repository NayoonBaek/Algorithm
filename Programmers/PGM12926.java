package org.example.programmers;

//[프로그래머스] 시저 암호
//https://school.programmers.co.kr/learn/courses/30/lessons/12926
public class PGM12926 {
    public static String solution(String s, int n) {
        String answer = "";
        StringBuilder ans = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c==' '){
                ans.append(c);
            }else if('a'<=c && c<='z'){
                ans.append ((char)('a'+(c+n-'a')%26));
            }else {
                ans.append((char)('A'+(c+n-'A')%26));
            }
        }
        return answer = ans.toString();
    }

    public static void main(String[] args) {
        String answer = solution("a B z", 4);
        System.out.println(answer);
    }
}
