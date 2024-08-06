import java.util.Scanner;

public class RecursiveUsHesaplama {
    
    static int usAlma(int us,int taban){
        int carpim=1;
        
        if(us<=0){
            return 1;
        }
        
        return taban*usAlma(us-1,taban);
    }
    public static void main(String[] args){
        
        int us,taban;
        Scanner input = new Scanner(System.in);
        System.out.println("Taban ve Us degerlerini giriniz:");
        taban = input.nextInt();
        us = input.nextInt();
        
        System.out.println("Islem Sonucu: "+usAlma(us,taban));
        
    }
}
