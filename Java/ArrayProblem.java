import java.util.Scanner;
public class ArrayProblem{
     public static void main(String args[]){
           int arr[] = new int[5];
           int sum = 0;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter 5 integers values");
           for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Array Elements values are");
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
                sum =sum+arr[i];
             }
             System.out.println("sum:"+sum);  
 }
}         