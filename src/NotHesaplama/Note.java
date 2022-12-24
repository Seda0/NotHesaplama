package NotHesaplama;

import java.util.Scanner;

public class Note {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Vize1: ");
		int vize1=scan.nextInt();
		
		System.out.println("Vize2: ");
		int vize2=scan.nextInt();
		
		System.out.println("Final: ");
		int Final=scan.nextInt();
		/*System.out.println("Okul Ortalamaniz:");
		double ortalama=scan.nextDouble();*/
		
		
		
	double ortalama=(vize1*3/10)+(vize2*3/10)+(Final*4/10);
	System.out.println(" Ortalama:"+ortalama);
	scan.nextLine();
	
	if(ortalama>=90) {
		
		System.out.println("AA Aldiniz ");
		
		
	}
		
	else if(ortalama>=85)	
	{
		System.out.println("BA Aldiniz ");
	}
	else if(ortalama>=80) {
		
		System.out.println("BB Aldiniz ");
	}
	else if(ortalama>=75) {
		System.out.println("CB Aldiniz ");
		
	}
	else if(ortalama>=70) {
		System.out.println("CC Aldiniz ");
		
	}
	
	else if(ortalama>=65) {
		System.out.println("DC Aldiniz ");
		
	}
	else if(ortalama>=60) {
		System.out.println("DD Aldiniz ");
		
		
			System.out.println("DD Aldiniz ve Ortalamanız Dusuk.Bu dersi Tekrardan almayi düsünebilirsiniz.");
	}
	
	else if(ortalama>=55)
	{
		System.out.println("FF Aldiniz ve Kaldiniz ");
		}
	
	}

	
}
