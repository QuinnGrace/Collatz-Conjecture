package collatzmain;
import java.util.*;
import java.math.*;
public class CollatzMain 
{
    public static void main(String[] args) 
    {
        //input BigInteger
        //making a bigint array so comparisons can happen
        int y = 3;
        BigInteger loopNumbers [] = new BigInteger[y];
        loopNumbers[0] = BigInteger.valueOf(4L);
        loopNumbers[1] = BigInteger.valueOf(2L);
        loopNumbers[2] = BigInteger.valueOf(1L);
        //get the number to compare
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number to be tested -> ");
        BigInteger testNumber = input.nextBigInteger();
       
        //while the number being tested is not endlessly looping
        for(int x = 0; x < loopNumbers.length; ++x)
            while (testNumber != loopNumbers[x])
            {
                //if it is an even number, divide by 2
                if(testNumber.mod(BigInteger.valueOf(2L))  == BigInteger.ZERO)
                {
                    testNumber = testNumber.divide(BigInteger.valueOf(2L));
                    System.out.println(testNumber);
                }
                else
                {
                    //if it is an odd number, multiply by 3 then add 1
                    testNumber = testNumber.multiply(BigInteger.valueOf(3L));
                    testNumber = testNumber.add(BigInteger.ONE);
                    System.out.println(testNumber);
                }
            }
    }
}