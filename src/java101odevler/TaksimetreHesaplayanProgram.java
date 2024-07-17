import java.util.Scanner;

public class TaksimetreHesaplayanProgram {
  
    public static void main(String[] args){
        
     int taxi;
     Scanner input = new Scanner(System.in);
     System.out.print("Gidilen km degerini giriniz:");
     taxi = input.nextInt();
        
      double ucret = 10+taxi*2.20;  
        
      if(ucret<20){
        ucret=20;
      }
      System.out.println("Toplam Tutar:"+ucret);
    }
}
