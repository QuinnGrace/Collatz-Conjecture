package collatzmain;
import java.util.*;
public class CollatzMain 
{
    public static void main(String[] args) 
    {
        //input BigInteger
        int testNumber;
        int loopNumbers [] = {4, 2, 1};
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number to be tested -> ");
        testNumber = input.nextInt();

        for(int x = 0; x < loopNumbers.length; ++x)
            while (testNumber != loopNumbers[x])
            {
                if(testNumber % 2 == 0)
                {
                    testNumber = testNumber / 2;
                    System.out.println(testNumber);
                }
                else
                {
                    testNumber = (3 * testNumber + 1);
                    System.out.println(testNumber);
                }
            }
    }
}