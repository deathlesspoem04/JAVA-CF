import java.io.*;
import java.util.Scanner;

class Stack
{
    int data[], top;

    public Stack( int size )
    {
        if( size <= 0 )
            throw new IllegalArgumentException();
        data = new int[ size ];
        top = -1;
    }

    public boolean isEmpty()
    {return top == -1;}


    public void push( int data )
    {if( top == this.data.length-1 )
            throw new OverflowException();
        else
            this.data[ ++top ] = data;}

    public int pop()
    {if( isEmpty() )
            throw new UnderflowException();
        else
            return data[top--];}
}

class OverflowException extends RuntimeException{
    public OverflowException(){
        super("Overflow exception. No memory left");}}

class UnderflowException extends RuntimeException{
    public UnderflowException(){
        super( "Underflow exception. No nodes left" );}}

class test
{
    public static void main( String args[] )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int size = sc.nextInt();
        boolean flag = false;
        Stack S = new Stack(size);
        while(!flag)
        {
            System.out.println("Enter 1 to Push\nEnter 2 to Pop\nEnter 3 to Exit");
            int ch = sc.nextInt();
            switch (ch)
            {
                case 1:{
                    System.out.println("Enter Data:");
                    int data = sc.nextInt();
                    S.push(data);
                    break;
                }
                case 2:{
                    int data = S.pop();
                    System.out.println("Popped Element :"+data);
                    break;
                }
                case 3:{
                    flag = true;
                }
            }
        }
    }
}