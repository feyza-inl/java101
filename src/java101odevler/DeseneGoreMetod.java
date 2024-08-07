import java.util.Scanner;

public class DeseneGoreMetod {
    
    static void DesenMetod(int n) {
       System.out.print(n+" ");
        if (n <= 0) {
            return; 
        }
        DesenMetod(n - 5);
        System.out.print(n+" ");
    }
    public static void main(String[] args){
        
        int sayi;
        Scanner input = new Scanner (System.in);
        System.out.println("Bir sayi giriniz:");
        sayi = input.nextInt();
        
        System.out.print("Cikti: ");
       DesenMetod(sayi);
        
        input.close();          
    }
}
