import java.util.Scanner;

public class SayilariBüyüktenKüçüğeHesaplama {
  public static void main(String[] args){
     
      int say1,say2,say3;
      Scanner input = new Scanner(System.in);
      System.out.println("3 adet sayi giriniz:");
      say1 = input.nextInt();
      say2 = input.nextInt();
      say3 = input.nextInt();
      
      if( (say1>say2) && (say1>say3)){
          if(say2>say3){
             System.out.println(say1+"-"+say2+"-"+say3);
          }
          else{
              System.out.println(say1+"-"+say3+"-"+say3);
          }
      }
      
      else if((say2>say1) && (say2>say3)){
          if(say1>say3){
              System.out.println(say2+"-"+say1+"-"+say3);
          }
          else{
              System.out.println(say2+"-"+say3+"-"+say1);
          }
      }
      else{
          if(say2>say1){
              System.out.println(say3+"-"+say2+"-"+say1);
          }
          else{
              System.out.println(say3+"-"+say1+"-"+say2);
          }
      }
  }  
}
