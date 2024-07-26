import java.util.Scanner;

public class ÜslüSayiHessaplayanProgram {
   public static void main(String[] args){
       
       int taban,us,total=1;
       Scanner input = new Scanner(System.in);
       System.out.print("Taban ve Us degerlerini giriniz:");
       taban = input.nextInt();
       us = input.nextInt();
       
       for(int i=1;i<=us;i++){
           total*=taban;        
   }
       
   System.out.println(total);      
   } 
}
