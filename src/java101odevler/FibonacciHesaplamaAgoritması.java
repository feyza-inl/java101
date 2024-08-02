import java.util.Scanner;

public class FibonacciHesaplamaAgoritması {
    public static void main(String[] args){
        
       int adet,birinci=0,ikinci=1,ucuncu = 0;
       Scanner input = new Scanner(System.in);
       System.out.println("Bir sayi giriniz:");
       adet = input.nextInt();
        
      System.out.print("0");
        
      for(int i=1;i<=adet;i++){
            birinci=ikinci;
            ikinci=ucuncu;
            ucuncu=birinci+ikinci;
          System.out.print(" "+ucuncu);
      }
      System.out.print("\n");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
