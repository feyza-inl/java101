import java.util.Scanner;

public class DaireDilimi {

public static void main(String[] args){
    
    int yaricap,merkezAci;
    System.out.println("Bir yaricap degeri ve markez acisini giriniz:");
    Scanner input = new Scanner(System.in);
    yaricap = input.nextInt();
    merkezAci = input.nextInt();
    
    double daire_alan =(3.14*(yaricap*yaricap)*merkezAci)/360; 
    
    System.out.println("Daire Diliminin Alani:"+daire_alan);
}    
}
