
package practicedatastructure;

/**
 *
 * @author Arjeric Mark
 */
public class assDatastruc {

     public static int fibonacciLoop(int n){
         if (n == 0) { 
            System.out.println("V1(0) = 0");
            return 0;
        } else if (n == 1) { 
            System.out.println("V2(1) = 1");
            return 1;
        }

        int a = 0; // 
        int b = 1; // 
        int result = 0;

        System.out.print("V1(0) = 0, V2(1) = 1"); 
        for (int i = 2; i <= n; i++) {
            result = a + b; 
            System.out.print(", V(" + i + ") = " + result); 
            a = b; 
            b = result; 
        }

        System.out.println(); 
        return result; 
    }

   
        

    
    public static void main(String[] args) {
        int n = 20; 
        System.out.println("Fibonacci(" + n + ") = " + fibonacciLoop(n)); 
    
    }
        
        
    
    
}
