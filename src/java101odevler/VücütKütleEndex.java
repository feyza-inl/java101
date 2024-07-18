import java.util.Scanner;

public class VücütKütleEndex {
    public static void main(String[] args){
        
        int kilo;
        float boy,index;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen boyunuzu(metre cinsinde) giriniz:");
        boy = input.nextFloat();
        System.out.println("Lutfen kilonuzu giriniz:");
        kilo = input.nextInt();
        
        index = kilo/(boy*boy);
        
        System.out.println("Vucut Kitle İndeksiniz:"+index);
    }
}
