import java.util.Scanner;

public class SicakliktaEtkinlikÖnerme {
    public static void main(String[] args){
        int deger;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sicaklik degeri giriniz:");
        deger = input.nextInt();
        if(deger < 5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if(deger > 5 && deger < 15){
          System.out.println("Sinemaya gidebilirsiniz.");  
        }
        else if(deger > 10 && deger < 25){
            System.out.println("Piknik yapabilirsiniz.");
        }
        else if(deger > 25){
            System.out.println("Yuzmeye gidebilirsiniz.");
        }        
    }
}
