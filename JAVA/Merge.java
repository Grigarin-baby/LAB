import java.util.Scanner;

public class Merge {
    public static void main(String args[]) {
        int n1, n2, k;
        
        // Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Input the number of elements in the first array
        System.out.println("Enter number of elements in first array");
        n1 = sc.nextInt();
        
        // Declare the first array based on input size
        int a[] = new int[n1];
        
        // Input the elements of the first array
        System.out.println("Enter the first array elements");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        
        // Input the number of elements in the second array
        System.out.println("Enter number of elements in second array");
        n2 = sc.nextInt();  // Now correctly initializing n2
        
        // Declare the second array based on input size
        int b[] = new int[n2];
        
        // Input the elements of the second array
        System.out.println("Enter the second array elements");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }
        
        // Declare the merged array based on the total size
        int c[] = new int[n1 + n2];
        
        // Merge the two arrays into the third array
        k = 0;
        for (int i = 0; i < n1; i++) {
            c[k] = a[i];
            k++;
        }
        for (int i = 0; i < n2; i++) {
            c[k] = b[i];
            k++;
        }
        
        // Output the first array
        System.out.println("First array:");
        for (int i = 0; i < n1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        // Output the second array
        System.out.println("Second array:");
        for (int i = 0; i < n2; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        
        // Output the merged array
        System.out.println("Merged array:");
        for (int i = 0; i < n1 + n2; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
        
        sc.close();  // Close the scanner object
    }
}
