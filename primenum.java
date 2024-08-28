import java.util.*;
import java.util.Scanner;

/*
import java.math.*;

class primenumcheck{
  int primeck(int l,int h){
    int c=0;
    for(int i=l;i<=h;i++){
        for(int j=i;j<=h;j++){
            if(Math.sqrt(i)%j==0){
                c++;
                return i;
    
            }
            

        }
      
    }
    return 0;
  }

}
 class primenum{
  public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
      int l,h;
      System.out.println("enter the frist number of the range where ranfge is starts : ");
       l=sc.nextInt();
      System.out.println("enter the frist number of the range where ranfge is starts : ");
       h=sc.nextInt();
       primenumcheck pc =new primenumcheck();
       pc.primeck(l, h);
    }
 }
    */

    /**
     * primenum
     */
     /**
      * Innerprimenum
      */
class isprime{
      
        int checkprime(int n){
            int c=0;
            if(int i=2;i<n;i++){
              c++;

            }
            if(c==0){
                System.out.print("number is prime !");
            }else{
                System.out.println("number is not a primne !");
            }
            return 0;
        }
  
     }
      
     class primenum {
    
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            isprime cp=new isprime();
            int n;
            System.out.println("enter the number : ");
            n=nextInt();
            
            cp.checkprime(n);

        }

     
    }