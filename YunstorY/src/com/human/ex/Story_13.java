package com.human.ex;

public class Story_13 {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		
		
		
		
		/* �Ž����� 
		System.out.println("��ǰ���� = ");
		int price=Integer.parseInt(scanner.nextLine());
		
		System.out.println("���� �� = ");
		int moneyinput=Integer.parseInt(scanner.nextLine());
		
		System.out.println("�Ž����� = "+ (moneyinput - price));
		
		
		int i = moneyinput;
		int change1000 = i/1000;
		int change500 = (i%1000)/500; 
		int change100 = (i%500)/100;
		int change50 = (i%100)/50;
		int change10 = (i%50)/10;
		
		if(i<=10) {
			System.out.println("10�� ���ϴ� �Է¹��� �ʽ��ϴ�.");
		}
		
		System.out.println("õ��¥��" + change1000 + "��, �����¥�� " + change500 + "��, ���¥��" + change100 
				+ "��, ���ʿ�¥��" + change50 + "��, �ʿ�¥��" + change10 + "��");
*/
		
		
		int inputString=10;
		int moneyTotal=0;
		int money=0;
		int moneyInput=0;
		
		
		while(inputString!=0) {
			System.out.println("\n�޴���ȣ < 1.���̴� 700�� 2.�ݶ� 500�� 3.ȯŸ 350�� 4.���� 5.��ȯ>");
			System.out.print("�޴����� = ");
			inputString=Integer.parseInt(scanner.nextLine());
			
			if(inputString==1) {
				System.out.println("���ø޴� = ���̴�");
				money += 700;
				
			}else if(inputString==2) {
				System.out.println("���ø޴� = �ݶ�");
				money += 500;
				
			}else if(inputString==3) {
				System.out.println("���ø޴� = ȯŸ");
				money += 350;
				
			}else if(inputString==4) {
				System.out.println("�ѱݾ� = " + (moneyTotal = money));
				
				System.out.print("���Ծ� = ");
				moneyInput=Integer.parseInt(scanner.nextLine());
				
			}else if(inputString==5) {
				System.out.println("��ȯ�� = " + (moneyInput-moneyTotal));
				
				int i = moneyInput-moneyTotal;
				int change1000 = i/1000;
				int change500 = (i%1000)/500; 
				int change100 = (i%500)/100;
				int change50 = (i%100)/50;
				int change10 = (i%50)/10;
				
				System.out.println("õ��¥��" + change1000 + "��, �����¥�� " + change500 + "��, ���¥��" + change100 
						+ "��, ���ʿ�¥��" + change50 + "��, �ʿ�¥��" + change10 + "��");
			}
		
		}
		
		

}
}
