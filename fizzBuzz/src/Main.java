import java.util.Scanner;

public class Main {

    public static void fizBuz(){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Sınırı : ");
        int number = input.nextInt();
        
        boolean fizzDiv = i % 3 == 0;
        boolean buzzDiv = i % 5 == 0;

        for (int i = 1; i <= number; i++){
            

           if(fizzDiv && buzzDiv) {
               System.out.println("Fizz-Buzz");
           }else if(fizzDiv){
               System.out.println("Fizz");
           }else if(buzzDiv){
               System.out.println("Buzz");
           }else {
               System.out.println(i);
           }
        }
    }
    public static void main(String[] args) {
      fizBuz();
    }
}
