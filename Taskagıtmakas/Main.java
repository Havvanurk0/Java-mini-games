package Taskagıtmakas;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		String[] secenekler = ["taş","kağıt","makas"];
		int indeks = rand.nextInt(3);
		String bilsecim = secenekler[indeks];
		Scanner scan = new Scanner(System.in);
		System.out.println("Birini seçin:\n 1.taş\n 2.kağıt\n 3.makas\n 3 kez bilen oyunu kazanır");
		int secim = scan.nextInt();
		int hak=0;
		while(hak>3) {
		if(secim == 0) {
			if(secim == bilsecim) {
			System.out.print("kimse kazanamadı");
			}else if(bilsecim ==1) {
				System.out.print("bilgiayar bu turu kazandı.");
			}else if(bilsecim == 2) {
				System.out.println("bu turu siz kazandınız");
			}
			hak++;
			System.out.print(" kalan hakkınız: "+ hak);
			
			}else if(secim ==1){
				if(bilsecim==0) {
					System.out.println("siz kazandınız");
				}else if(bilsecim == 1){
					System.out.println("kimse kazanamadı");
				}else if(bilsecim == 2) {
					System.out.println("bilgisayar kazandı");
				}
				hak++;
				System.out.println("kalan hakkınız: "+hak);
				
			}else if(secim==2) {
				if(bilsecim==0) {
					System.out.println("bilgisayar kazandı");
				}else if(bilsecim==1){
					System.out.println("siz kazandınız");
					}else if(bilsecim==2) {
						System.out.println("kimse kazanamadı");
					}
				hak++;
				System.out.println("kalan hakkınız: "+hak);
				}
		
		}
		
	}

}
	
