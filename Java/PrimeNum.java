import java.util.Scanner;
public class PrimeNum{
    public static void main(String args[]){
    int m = 0;
    int flag = 0;
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    m=a/2;
    if(a ==0 || a==1){
        System.out.println("Not a prime number");
    }
    else{
        for(int i=2;i<m;i++){
            if(a%i == 0){
                 System.out.println("Not a prime number");
                 flag = 1;
                 break;
            }
            if(flag==0){
                System.out.println("Prime number");
                break;
            }
        }
    }

    
    }
    
}