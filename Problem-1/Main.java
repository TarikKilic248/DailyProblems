import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int sayac = 0;
  int[] dizi = { 10, 7, 5, 8, 45, 10, 45, 75, 24 };
  Scanner klavye = new Scanner(System.in);

  System.out.println("Dizide aramak istediğiniz elemanı girin");

  int ara = klavye.nextInt();

  for(int i = 0; i<dizi.length; i++){
      if(ara == dizi[i]){
        sayac = sayac + 1;
      }
    }
    klavye.close();
  
  System.out.println("Dizide aralınan sayı        : "+ara);
  System.out.println("Dizide tekrar edilme sayısı : "+sayac);
  }
  
}