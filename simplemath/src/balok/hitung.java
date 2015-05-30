package balok;

import java.util.Scanner;

public class hitung {
		public int menu(){
			Scanner masuk = new Scanner(System.in);
			int pil=0;
			System.out.println("====== MENU ===============");
			System.out.println("1.Hitung Luas Balok");
			System.out.println("2.Hitung Volume Balok");
			System.out.println("3.Hitung Keliling Balok");
			System.out.println("4.Hitung Diagonal Balok");
			System.out.println("5.Hitung Luas Segitiga");
			System.out.println("6.Hitung PIPOLONDO");
			System.out.println("===========================");
			System.out.print("Masukkan Pilihan anda : ");
			pil=masuk.nextInt();
			if (pil==1){
				hitung obyek  = new hitung();
				System.out.print(obyek.masuk());
				int p=0,l=0,t=0;
				System.out.print(obyek.luasBalok(p,l,t));
				}else if(pil==6){
					pipolondo();
				}
			return pil;
		}
		
		public int masuk(){
		Scanner masuk=new Scanner(System.in);
			int p,l,t;
			int pil=0;
			System.out.print("Masukan Panjang:");
			p=masuk.nextInt();
			System.out.print("Masukan lebar:");
			l=masuk.nextInt();
			System.out.print("Masukkan tinggi:");
			t=masuk.nextInt();
			return t;
			
		}
		public int luasBalok(int p,int l, int t){
			int luasBalok;
			luasBalok=2*p*l+2*p*t+2*l*t;
			return luasBalok;
		}
		public void pipolondo(){
			Scanner masuk=new Scanner(System.in);
			int a,b, hasil;
			String pilihan;			
			
			System.out.print("Masukan pipolondo / (x,/,+,-) = ");
			pilihan=masuk.nextLine();
			System.out.print("Masukan nilai A:");
			a=masuk.nextInt();
			System.out.print("Masukan nilai B:");
			b=masuk.nextInt();

			if(pilihan.equals("x")||pilihan.equals("X")){
				hasil=a*b;
				System.out.print("Masukan nilai B:"+hasil);
			}else if(pilihan.equals(":")){
		        hasil = a/b;
		        System.out.print("Hasil dari A:B="+hasil);
		      
		      }else if(pilihan.equals("+")){
		        hasil = a+b;
		        System.out.print("Hasil dari A+B="+hasil);
		      
		      }else if(pilihan.equals("-")){
		        hasil = a-b;
		        System.out.print("Hasil dari A-B="+hasil);
		      }else{
				
			}
			System.out.print("\n==========================");
			System.out.print("\n");
			
			
		}
		
		
		
		public static void main(String args[]){
			
			hitung obyek = new hitung();
			System.out.println(obyek.menu());
		}
}

