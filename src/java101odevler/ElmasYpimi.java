import java.util.Scanner;

public class ElmasYpimi {
   public static void main(String[] args){
       
       int sayi;
       Scanner input = new Scanner(System.in);
       System.out.println("Bir sayi giriniz:");
       sayi = input.nextInt();
       
       for(int i=1;i<=sayi;i++){
           for(int j=1;j<=(sayi-i);j++){
             System.out.print(" ");        
           }
           for(int k=1;k<=2*i-1;k++){
               System.out.print("*");
           }
           System.out.println();
           
       }
       
       for(int i=sayi-1;i>0;i--){
           for(int j=sayi-i;j>0;j--){
             System.out.print(" ");        
           }
           for(int k=2*i-1;k>0;k--){
               System.out.print("*");
           }
           
           System.out.println();
           
       }
            
   } 
}
