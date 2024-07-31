import java.util.Scanner;

public class EbobEkokÖdevi {
    public static void main(String[] args){
        
      int say1,say2,ebob=0,ekok=1;
      Scanner input = new Scanner (System.in);
      System.out.println("2 sayi giriniz:");
      say1 = input.nextInt();
      say2 = input.nextInt();
      
     
      if(say1>say2){
              int i=say2;
          while(i>0){
              if(say1%i==0 && say2%i==0){
                  ebob=i;
                  break;
              }
              i--;
          }
      }
      else{
             int i=say1;
          while(i>0){
              if(say1%i==0 && say2%i==0){
                  ebob=i;
                  break;
              }
              i--;
          }
      } 
      ekok = (say1*say2)/ebob;
      System.out.println("Ebob Degeri :"+ebob);
      System.out.println("Ekok Degeri :"+ekok);     
    }
}
