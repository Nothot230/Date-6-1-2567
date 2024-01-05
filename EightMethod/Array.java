package EightMethod;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int[] A = new int[5];
        System.out.print("Enter Array:");
        
        for(int i = 0; i<5; i++){
            A[i] = sc.nextInt();
        }
        int R = Sum(A);
        int T = AVG(A);
        int Y = Max(A);
        int U = Min(A);
        
        System.out.println("Sum is:" +R);
        System.out.println("AVG:" +T);
        System.out.println("Max:" +Y);
        System.out.println("Min:" +U);
        asdSorting(A);    
        deSorting(A);
    }
    
    public static int Sum(int A1[]){
        int result = 0;
        int sum = 0;
        int n = 4;
        for(int i = 0; i<A1.length;i++){  
            if(A1[i] != A1[4]){
                sum = A1[i]+A1[i+1];
            }else{
                sum = A1[4];
            }
            i +=1;
            result += sum;
            n--;
        }
           
        return result;
    }

    public static int AVG(int A1[]){
        int result;
        result = Sum(A1)/A1.length;
        return result;
    }
    public static int Max(int A1[]){
        int result = A1[0];
        for(int i = 0; i<A1.length;i++){
            if(A1[i] > result){
                result = A1[i];
            }

            
        }
        return result;
    }
    public static int Min(int A1[]){
        int result = A1[0];
        for(int i = 0; i<A1.length;i++){
            if(A1[i] < result){
                result = A1[i];
            }

            
        }
        return result;
    }  

    public static void asdSorting(int A1[]){
        int n = A1.length; 
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (A1[j] > A1[j + 1]) { 
                    // swap temp and arr[i] 
                    int temp = A1[j]; 
                    A1[j] = A1[j + 1]; 
                    A1[j + 1] = temp; 
                }   
            } 
                
        }
        System.out.println("น้อยไปมาก");
        for(int i = 0; i< A1.length;i++){
            System.out.print(A1[i] + " ");
        } 
            
    }
    public static void deSorting(int A1[]){
        int n = A1.length; 
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (A1[j] < A1[j + 1]) { 
                    // swap temp and arr[i] 
                    int temp = A1[j]; 
                    A1[j] = A1[j + 1]; 
                    A1[j + 1] = temp; 
                }   
            } 
                
        }
        System.out.println("มากไปน้อย");
        for(int i = 0; i< A1.length;i++){
            System.out.print(A1[i] + " ");
        } 
            
    }
}
