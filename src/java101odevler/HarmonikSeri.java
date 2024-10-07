import java.util.Scanner;


public class HarmonikSeri {
  public static void main(String[] args){
      
      int sayi;
      Scanner girdi = new Scanner(System.in);
      System.out.println("Bir sayi giriniz:");
      sayi= girdi.nextInt();
      double[] dizi = new double[sayi];
      double toplam = 0;
      
      
      for(int i=1;i<=sayi;i++){
          dizi[i-1]=1.0/i;
          toplam+=dizi[i-1];
      }
      
      
      double Harmonik = sayi/toplam;
      System.out.println("Harmonik Ortalama: "+Harmonik);
      
  }  
}
