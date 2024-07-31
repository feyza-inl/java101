import java.util.Scanner;

public class MükemmelSayiHesaplama {
   public static void main(String[] args){
    
      int sayi,toplam=0;
      Scanner input = new Scanner(System.in);
      System.out.println("Bir sayi giriniz:");
      sayi = input.nextInt();
      
      for(int i=1;i<=sayi/2;i++){
          if(sayi%i==0){
              toplam+=i;
          }
      }    
      
      if(toplam==sayi){
          System.out.println(sayi + " bir mukemmel sayidir.");
      }
      else{
          System.out.println(sayi + " mukemmel sayi degildir.");
      }
   } 
}
