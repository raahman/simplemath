/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplemath_clone;

/**
 *
 * @author alif
 */
import java.util.Scanner;

public class Simplemath_clone {
    Scanner masuk=new Scanner(System.in);
    int panjang , lebar , tinggi, hasil;
    String coba;
    
		public void menu(){
                        Simplemath_clone obyek  = new Simplemath_clone();
			int pil;
			System.out.println("====== MENU ======");
			System.out.println("1.Hitung Luas Balok");
			System.out.println("2.Hitung Volume Balok");
			System.out.println("3.Hitung Keliling Balok");
			System.out.println("4.Hitung Diagonal Balok");
			System.out.println("5.Hitung Luas Segitiga");
                        System.out.println("================================");
			System.out.print("Masukkan Pilihan anda : ");
			pil=masuk.nextInt();
			if (pil==1){
                            obyek.setLuasBalok();
                        } else if (pil==2) {
                            obyek.setVolumeBalok();
                        } else if (pil==3) {
                            obyek.setKelilingBalok();
                        } else if (pil==4) {
                            obyek.setDiagonalBalok();
                        } else if (pil==5) {
                            // belum ada
                        } else {
                            System.out.println("Nomor Yang dipilih Tidak ada ");
                        } 
			
		}
		
                // engine view
		public void setLuasBalok() {
                    System.out.println("Menghitung Luas Balok");
                    System.out.println("===================================");
                    System.out.print("Masukan Panjang   : ");
                    panjang=masuk.nextInt();
                    System.out.print("Masukan lebar     : ");
                    lebar=masuk.nextInt();
                    System.out.print("Masukkan tinggi   : ");
                    tinggi=masuk.nextInt();

                    // hitung balok
                    luasBalok(lebar, lebar, tinggi);
		}
                
                public void setVolumeBalok() {
                    System.out.println("Menghitung Volume Balok");
                    System.out.println("===================================");
                    System.out.print("Masukan Panjang   : ");
                    panjang=masuk.nextInt();
                    System.out.print("Masukan lebar     : ");
                    lebar=masuk.nextInt();
                    System.out.print("Masukkan tinggi   : ");
                    tinggi=masuk.nextInt();

                    // hitung balok
                    getVolumeBalok(panjang, lebar, tinggi);
		}
                
                public void setKelilingBalok() {
                    System.out.println("Menghitung Keliling Balok");
                    System.out.println("===================================");
                    System.out.print("Masukan Panjang   : ");
                    panjang=masuk.nextInt();
                    System.out.print("Masukan lebar     : ");
                    lebar=masuk.nextInt();
                    System.out.print("Masukkan tinggi   : ");
                    tinggi=masuk.nextInt();

                    // hitung balok
                    getKelilingBalok(panjang, lebar, tinggi);
		}
                
                public void setDiagonalBalok() {
                    System.out.println("Menghitung Diagonal Balok");
                    System.out.println("===================================");
                    System.out.print("Masukan Panjang   : ");
                    panjang=masuk.nextInt();
                    System.out.print("Masukan lebar     : ");
                    lebar=masuk.nextInt();
                    System.out.print("Masukkan tinggi   : ");
                    tinggi=masuk.nextInt();

                    // hitung balok
                    getDiagonal(panjang, lebar, tinggi);
		}
                
                
                
                // engine hitung 
                public int getKelilingBalok(int panjang , int lebar , int tinggi) {
                    hasil = 4 * (panjang + lebar + tinggi);
                    System.out.println("Hasil Keliling Balok = " + hasil);
                    return hasil;
                } 
                
		public int luasBalok(int p,int l, int t){
			int luasBalok;
			luasBalok=2*p*l+2*p*t+2*l*t;
                        System.out.println("Hasil Luas Balok = " + luasBalok);
			return luasBalok;
		}
		
                public int getDiagonal(int panjang , int lebar , int tinggi) {
                    hasil = (int) Math.sqrt(Math.pow(panjang, 2)+Math.pow(lebar, 2)+Math.pow(tinggi, 2));
                    System.out.println("Hasil Diagonal Balok = " + hasil);
                    return hasil;
                }
		
                public int getVolumeBalok(int panjang , int lebar , int tinggi) {
                    hasil = panjang * lebar * tinggi;
                    System.out.println("Hasil Volume Balok = " + hasil);
                    return hasil;
                }
		
                public void run() {
                    Simplemath_clone obyek = new Simplemath_clone();
                    do {
                        obyek.menu();
                        System.out.println("");
                            System.out.print("Mau Coba Lagi (y / t) = ");
                            coba = masuk.next();
                        } while(coba.equals("y"));
                    }
                
                
		public static void main(String args[]){
		   Simplemath_clone obyek = new Simplemath_clone();
                   obyek.run();
                        
		}
}
