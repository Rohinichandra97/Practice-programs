import java.util.Random;

class Lab5c
{
    public static void main(String[] args)
    {
        boolean[] anArray;  // declares an array of integers

        anArray = new boolean[100];  // allocates memory for 5 integers

      /*  anArray[0] = 100; // initialize first element
        anArray[1] = 200; // initialize second element
        anArray[2] = 300; // etc.
        anArray[3] = 400;
        anArray[4] = 500;*/
        boolean ting = true;
        
        for(int t=0;t<100;t++)
        {
        	anArray[t]=!ting;
        	ting=!ting;
        }
        

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 3: " + anArray[3]);
        System.out.println("Element at index 4: " + anArray[4]);
    }
}