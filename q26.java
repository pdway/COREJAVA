import java.io.*; 
import java.util.Scanner;
  
class q26 { 
    
  
  

static int m = 4; 
static int n = 4; 
  

static void row_sum(int arr[][]) 
{ 
  
    int i,j,sum = 0; 
  
    System.out.print( "\nFinding Sum of each row:\n\n"); 
  
    
    for (i = 0; i < 4; ++i) { 
        for (j = 0; j < 4; ++j) { 
  
            
            sum = sum + arr[i][j]; 
        } 
  
        
        System.out.println( "Sum of the row "
            + i + " = " + sum); 
          
  
       
        sum = 0; 
    } 
} 
  
  

    public static void main (String[] args) { 
	Scanner sc = new Scanner(System.in);
            int i,j; 
    int [][]arr = new int[m][n]; 
  
   
  
    for (i = 0; i < m; i++) 
        for (j = 0; j < n; j++) 
            arr[i][j] = sc.nextInt();
 
  
    row_sum(arr); 

    } 
} 