import java.util.Scanner;
class Fibonacci{
    public static void main(String args[]){
        int a = 0;
        int b = 1;
        int sum ;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0 ;i<num;i++){
            sum =a+b; 
            System.out.println(sum);
            a = b;
            b =sum;
        }
        
    }
}