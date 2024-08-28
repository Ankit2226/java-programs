import java.util.*;
class evencheck{

void evenno(int s,int h){
  
      for(int i=s;i<=h;i++){
         if(i%2==0){
            System.out.println(i);
            i++;
            
         }
      }
   

  }
}

class evennum {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
         int s,h;
         System.out.println("Enter the starting range of the range : ");
         s=sc.nextInt();
         System.out.println("Enter the last  range of the range : ");
         h=sc.nextInt();
            
         evencheck ec=new evencheck();
         ec.evenno(s, h);
        
        
    }
}
