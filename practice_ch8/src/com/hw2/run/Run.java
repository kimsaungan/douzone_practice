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
			
	
			System.out.print("�г��� �Է��ϼ��� : ");
			int grade = sc.nextInt();

			System.out.print("���� �Է��ϼ��� : ");
			int classroom = sc.nextInt();
			
			
			System.out.print("�̸��� �Է��ϼ��� : ");
			String name = sc.next();
		
			
			System.out.print("���������� �Է��ϼ��� : ");
			int kor = sc.nextInt();
			

			System.out.print("���������� �Է��ϼ��� : ");
			int eng = sc.nextInt();
			
			System.out.print("���������� �Է��ϼ��� : ");
			int math = sc.nextInt();
			
			
			s_arr[count] = new Student(grade, classroom, name, kor, eng, math);
			
			
			System.out.println("ȸ�� ����� ��� �����Ͻðڽ��ϱ�?");
			char yorn = sc.next().charAt(0);
			
			
			if(yorn=='n')
				break;
			
			count++; // ȸ�� �� �� �߰� �Ǹ� ��ü �迭 �ε��� 1 ����
		}
		
		for(int i=0; i<count; i++) {
			System.out.println(s_arr[i].information());
		}
		
		
		
	}

}
