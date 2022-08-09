package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Student[] s_arr = new Student[10];
		
		int count=0;
		
		while(true) {
			
	
			System.out.print("학년을 입력하세요 : ");
			int grade = sc.nextInt();

			System.out.print("반을 입력하세요 : ");
			int classroom = sc.nextInt();
			
			
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
		
			
			System.out.print("국어점수을 입력하세요 : ");
			int kor = sc.nextInt();
			

			System.out.print("영어점수을 입력하세요 : ");
			int eng = sc.nextInt();
			
			System.out.print("수학점수을 입력하세요 : ");
			int math = sc.nextInt();
			
			
			s_arr[count] = new Student(grade, classroom, name, kor, eng, math);
			
			
			System.out.println("회원 등록을 계속 진행하시겠습니까?");
			char yorn = sc.next().charAt(0);
			
			
			if(yorn=='n')
				break;
			
			count++; // 회원 한 명 추가 되면 객체 배열 인덱스 1 증가
		}
		
		for(int i=0; i<count; i++) {
			System.out.println(s_arr[i].information());
		}
		
		
		
	}

}
