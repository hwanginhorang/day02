package homework;

import java.util.Scanner;

public class Meju {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String s1, s2;
      String t1, t2, t3, t4;
      String s4;
      
      System.out.println("닉네임을 입력하세요.");
      s1 = input.next();
      
      System.out.println("직업을 선택하세요.");
      System.out.println("검사" + "궁수" + "마법사" + "도적");
      s2 = input.next();  
      
      t1 = "검사";
      t2 = "궁수";
      t3 = "마법사";
      t4 = "도적";
      if (s2.equals(t1)||s2.equals(t2)||s2.equals(t3)||s2.equals(t4)){
         System.out.println(s1 + "님의 직업 : " + s2);
         System.out.println("상기 내용이 맞나요? y/n");
      }else{
         System.out.println("없는 직업입니다.");
      }
      
      s4 = input.next();
      if(s4.equals("y")) {
         System.out.println("게임을 시작합니다...");
      }else if(s4.equals("n")) {
         System.out.println("유저 정보를 초기화합니다...");
      }else{
            System.out.println("잘못입력하셨습니다.");
      }   
      
   }
}