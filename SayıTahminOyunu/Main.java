package SayıTahminOyunu;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
    int bilsayi = rand.nextInt(10);
	System.out.println(bilsayi);
	System.out.print("bir sayı giriniz:");
	int sayi = scan.nextInt();
	
	if(sayi == bilsayi) {
		System.out.println("tahmininz doğru");
		
		
	}else{
	
	System.out.println("tahmininiz yanlış");
	}

	
	}
}
