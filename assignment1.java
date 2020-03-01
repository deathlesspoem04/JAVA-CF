import java.io.*;
import java.util.Scanner;
class assignment1
{
    public static void main(String arzs[])
    {
        int j=0;
        int k=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Choice : 1 for $ Pattern , 2 for Area of Right Angled Triangle , 3 for matrix multiplication ");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1 :  {
                System.out.println("Enter the size of the pattern");
                int n = sc.nextInt ();
                for (int i = n ; i > 0 ; i--)
                {
                    for ( j = i ; j > 0; j--)
                    {
                        System.out.print("$");
                    }
                    System.out.println("");
                }
            } break ;
            case 2 :  {
                int h,b;
                System.out.println("Please Enter the height and base of the triangle :");
                h = sc.nextInt();
                b = sc.nextInt();
                areaR (h,b); // using method
            }break;
            case 3 :
            {
                System.out.println("Enter the size of the matrix");
                int n = sc.nextInt ();
                int matrix1[][] = new int [n][n];
                int matrix2[][] = new int [n][n];
                System.out.println("Enter the values of the first matrix");
                for (int i = 0 ; i < n ; i++)
                {
                    for( j= 0 ; j < n ; j++)
                    {
                        matrix1[i][j] = sc.nextInt();
                    }
                }
                System.out.println("Enter the values of the second matrix");
                for (int i = 0 ; i < n ; i++)
                {
                    for( j= 0 ; j < n ; j++)
                    {
                        matrix2[i][j] = sc.nextInt();
                    }
                }
                int matrix3[][] = new int [n][n];
                for (int i = 0 ; i < n ; i++)
                {
                    for( j= 0 ; j < n ; j++)
                    {
                        matrix3[i][j] = 0;
                    }
                }
                for (int i = 0 ; i < n ; i++)
                {
                    for(j= 0 ; j < n ; j++)
                    {
                        for(k = 0 ; k < n ; k++ )
                        {
                            matrix3[i][j] = matrix3[i][j] + matrix1[j][k]*matrix2[i][k];
                        }
                    }
                }
                System.out.println("Resulted Matrix after multiplication :");
                for (int i = 0 ; i < n ; i++)
                {
                    for( j= 0 ; j < n ; j++)
                    {
                        System.out.print(matrix3[i][j]+" ");
                    }
                    System.out.println("");
                }
            }break;
        }

    }
    public static void areaR(int height , int base)
    {
        double ar = 0.5*height*base;
        System.out.println("Area of the traingle = "+ ar);
    }
}