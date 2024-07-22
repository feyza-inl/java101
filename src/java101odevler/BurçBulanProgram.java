import java.util.Scanner;

public class BurçBulanProgram {
  public static void main(String[] args){
      
     int ay,gun;
     Scanner input = new Scanner(System.in);
     System.out.println("Ay ve Gun degerini giriniz:");
     ay = input.nextInt();
     gun = input.nextInt();
     
     if(ay==1){
        if((gun>= 1) && (gun<=31)){
            if(gun<=21){
                System.out.println("Oglak Burcusunuz");
            }
            else{
                System.out.println("Kova Burcusunuz");
            }
        } 
     }
        if(ay==2){
        if((gun>= 1) && (gun<=30)){
            if(gun<=19){
                System.out.println("Kova Burcusunuz");
            }
            else{
                System.out.println("Balik Burcusunuz");
            }
        } 
        }
        if(ay==3){
        if((gun>= 1) && (gun<=31)){
            if(gun<=20){
                System.out.println("Balik Burcusunuz");
            }
            else{
                System.out.println("Koc Burcusunuz");
            }
        } 
        }
        if(ay==4){
        if((gun>= 1) && (gun<=30)){
            if(gun<=20){
                System.out.println("Koc Burcusunuz");
            }
            else{
                System.out.println("Boga Burcusunuz");
            }
        }
        }
        if(ay==5){
        if((gun>= 1) && (gun<=31)){
            if(gun<=21){
                System.out.println("Boga Burcusunuz");
            }
            else{
                System.out.println("Ikizler Burcusunuz");
            }
        }
        }
        if(ay==6){
        if((gun>= 1) && (gun<=30)){
            if(gun<=22){
                System.out.println("Ikizler Burcusunuz");
            }
            else{
                System.out.println("Yengec Burcusunuz");
            }
        }
        }
        if(ay==7){
        if((gun>= 1) && (gun<=31)){
            if(gun<=22){
                System.out.println("Yengec Burcusunuz");
            }
            else{
                System.out.println("Aslan Burcusunuz");
            }
        }
        }
        if(ay==8){
        if((gun>= 1) && (gun<=30)){
            if(gun<=22){
                System.out.println("Aslan Burcusunuz");
            }
            else{
                System.out.println("Basak Burcusunuz");
            }
        }
        }
        if(ay==9){
        if((gun>= 1) && (gun<=31)){
            if(gun<=22){
                System.out.println("Basak Burcusunuz");
            }
            else{
                System.out.println("Terazi Burcusunuz");
            }
        }
     }
     
      if(ay==10){
        if((gun>= 1) && (gun<=30)){
            if(gun<=22){
                System.out.println("Terazi Burcusunuz");
            }
            else{
                System.out.println("Akrep Burcusunuz");
            }
        }
      }
      
      if(ay==11){
        if((gun>= 1) && (gun<=31)){
            if(gun<=21){
                System.out.println("Akrep Burcusunuz");
            }
            else{
                System.out.println("Yay Burcusunuz");
            }
        }
      }
      
      if(ay==12){
        if((gun>= 1) && (gun<=30)){
            if(gun<=21){
                System.out.println("Yay Burcusunuz");
            }
            else{
                System.out.println("Oglak Burcusunuz");
            }
        }
      }
  }    
}