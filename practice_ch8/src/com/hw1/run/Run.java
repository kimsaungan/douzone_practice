package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] e_arr = new Employee[3];
		
		e_arr[0] = new Employee();
		e_arr[1]= new Employee(1,"ȫ�浿", 19, 'M',"01022223333","���� ���");
		e_arr[2]= new Employee(2,"������","������","����",20,'F', 1000000, 0.01, "01011112222","���� ����");
		
		
		for(int i= 0; i<e_arr.length; i++) {
			e_arr[i].information();
			System.out.println("e_arr["+ i +"] : " + e_arr[i].information());
		}
		System.out.println("=================================================================");
		
		e_arr[0] = new Employee(0, "�踻��", "������", "����", 30, 'M', 3000000, 0.2, "01055559999", "���� ����");
		e_arr[1]= new Employee(1, "ȫ�浿", "��ȹ��", "����", 19, 'M', 4000000, 0.3, "01022223333", "���� ���");
		
		
		for(int i= 0; i<2; i++) {
			e_arr[i].information();
			System.out.println("e_arr["+ i +"] : " + e_arr[i].information());
		}
		System.out.println("=================================================================");
		
		// ȸ���� ������ �迭�� ����
		int[] y_sal= new int[3];
				
		for(int i =0; i<e_arr.length; i++) {
			
			int sal=e_arr[i].getSalary();
			double bonusPoint=e_arr[i].getBonusPoint();
			
			y_sal[i]=(int)((sal+(sal*bonusPoint))*12);
			
		}
	
		for(int i= 0; i<e_arr.length; i++) {
		
			System.out.println(e_arr[i].getEmpName()+"�� ���� : "+y_sal[i]+"��");
		
		}
		System.out.println("=================================================================");
		
		
	System.out.println("�������� ������ ��� : "+(y_sal[0]+y_sal[1]+y_sal[2])/3+"��");
		
		
	}
}
