import java.util.Scanner;

public class ArmstrongSayiHesaplam {
   public static void main(String[] args){
       
       int sayi,piece=0,firstNumber,firstTotal=1,GenelToplam=0;
       Scanner input = new Scanner(System.in);
       System.out.println("Bir sayi giriniz:");
       sayi = input.nextInt();
       int temp =sayi;
       
       while(temp!=0){
           temp/=10;
           piece++;
       }
       temp =sayi;
       
       while(temp!=0){
           firstNumber=temp%10;
           firstTotal=1;
           for(int i=1;i<=piece;i++){
               firstTotal*=firstNumber;
               
           }
           GenelToplam+=firstTotal;
           temp = temp/10;
       }
       if(GenelToplam==sayi){
       System.out.println("Armstrong Sayidir.");
       }
       else{
         System.out.println("Armstrong Sayi Degildir.");   
       }     
   } 
}
