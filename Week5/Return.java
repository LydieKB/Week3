import java.util.Scanner;

public class Return {
    public static void main (String [] args){
         
        Scanner KB = new Scanner (System.in);
        System.out.println("print the number : ");
        int inputNumber = KB.nextInt() ;
        boolean primeNumber = prime (inputNumber);
        if (primeNumber) {
           System.out.println(inputNumber+ " is it a prime number");
        }
        else {
            System.out.println(inputNumber+ "is it not a prime number");
        }
        KB.close();
    }
    public static boolean prime (int num){
        boolean primeNumber = true ;
       if (num<=1) {
             primeNumber = false ;  
            return primeNumber ;       
        }
        else {
           for (int i= 2; i <= num/2 ; i++){
           if ((num %i) == 0){
            primeNumber = false ; break ;     
           }   
           }
           return primeNumber ;
        }  
    }
     
}