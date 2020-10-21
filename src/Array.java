import java.util.Arrays; 
  
public class Array
{ 
    public static void main(String args[]) 
    { 
       
        int[] arr1 = new int[] {11, 24 ,37}; 
  
        System.out.println("Original Array"); 
        for (int i = 0; i < arr1.length; i++) 
            System.out.print(arr1[i] + " "); 
  
        int[] arr2 = Arrays.copyOf(arr1, 5); 
  
        arr2[3] = 91; 
        arr2[4] = 65; 
  
        System.out.println("\nNew array after modifications:"); 
        for (int i = 0; i < arr2.length; i++) 
            System.out.print(arr2[i] + " "); 
    } 
} 