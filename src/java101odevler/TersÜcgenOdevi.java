import java.util.Scanner;

public class TersÜcgenOdevi {
   public static void main(String[] args){
       
       int sayi;
       Scanner input =new Scanner(System.in);
       System.out.println("Bir sayi giriniz:");
       sayi = input.nextInt();
       
       for(int i=0;i<sayi;i++){
           for(int j=sayi-i;j>0;j--){
               System.out.print("*");
           }
           System.out.println();
       }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
   } 
}
