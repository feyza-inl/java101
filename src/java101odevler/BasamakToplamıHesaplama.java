import java.util.Scanner;

public class BasamakToplamıHesaplama {
  public static void main(String[] args){
      
      int sayi,adet=0,basIndex=0,toplam=0;
      Scanner input = new Scanner(System.in);
      System.out.println("Bir sayi giriniz:");
      sayi = input.nextInt();
      
      while(sayi!=0){
       basIndex =sayi%10;
       toplam+=basIndex;
        sayi=sayi/10 ;
      }
      System.out.println("Toplam:"+toplam);    
  }  
}
