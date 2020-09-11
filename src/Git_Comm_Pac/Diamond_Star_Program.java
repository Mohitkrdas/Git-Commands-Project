package Git_Comm_Pac;

import java.util.Scanner;

public class Diamond_Star_Program {

	public static void main(String[] args) 
	{
        int n, i, j, space = 1;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        space = n - 1;
        
        for (j = 1; j <= n; j++)  // For 5 rows
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }

        // 2nd half
        space = 1;
        for (j = 1; j <= n - 1; j++) // for down 4 rows
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }	

}
