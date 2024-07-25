import java.util.Scanner;

public class TekSayilarinToplami {
   public static void main(String[] args){
       
       int sayi,toplam=0;
       boolean girdi = true;
       Scanner input = new Scanner(System.in);
       
       while(girdi){
           System.out.print("Sayi giriniz:");
           sayi = input.nextInt();
           if(sayi%2!=0){
               break;
           }
           if(sayi%2==0 && sayi%4==0){
               toplam+=sayi;
           }
           
       }
       System.out.println("Toplam:"+toplam);       
   } 
}
