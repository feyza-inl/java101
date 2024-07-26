import java.util.Scanner;

public class FaktorielHesaplama {
   public static void main(String[] args){
          
       int N,R,total1=1,total2=1,total3=1;
       Scanner input = new Scanner(System.in);
       System.out.println("Eleman sayısı ve hangi konminasyonu istediginizi giriniz:");
        N = input.nextInt();
        R = input.nextInt();
        
      for(int i=1;i<=N;i++){
          total1*=i;
      }
   
      for(int i=1;i<=R;i++){
          total2*=i;
      }
      
      for(int i=1;i<=(N-R);i++){
          total3*=i;
          
      }  
     double kom =(total1/(total2*total3)); 
     System.out.println("Kombinasyon sonucu:"+kom);     
   } 
}
