
/*
 * To test the capabilities of MyMath maths functions.
 * 
 * @author (Reece Gavin) 
 * @ID Number - 17197589
 * @version (last modified 5/10/17)
 */
public class MyMathTest
{
   public static void main(String[] args)
  
   {
       /*
        * Name: mean4
        * Purpose: To get to mean of four integers and test if it is correct
        * Inputs: a = 4, b = 40, c = 44 d = 25,
        * Expected Output: 28.25
        */
       double mean4Result = MyMath.Mean4(4,40,44,25);
       double mean4Expected = 28.25;
       System.out.println("Method Name: mean4");
       System.out.println("Description: To get to mean of four integers and test if it is correct");
       System.out.println("The inputted values were: MyMath.mean4(4,40,44,25)");
       System.out.println("The result of the four means is: " + mean4Result);
       System.out.println("The Expected result was: " + mean4Expected);
       if (mean4Result==mean4Expected)
        System.out.println("Test Passed");
       else System.out.println("Test Failed");
       
        /*
        * Name: Max
        * Purpose: To identify the maximum of four integers
        * Inputs: a = 20, b = 30, c =45
        * Expected Output: 45
        */
       System.out.println("");
       System.out.println("");
       int maxResult = MyMath.Max(20,30,45);
       int maxExpected = 45;
       System.out.println("Method Name: Max");
       System.out.println("Description: To identify the maximum of three integers");
       System.out.println("The inputted values were: MyMath.Max(20,30,45)");
       System.out.println("The max is: " + maxResult);
       System.out.println("The Expected result was: " + maxExpected);
       if (maxResult==maxExpected)
        System.out.println("Test Passed");
       else System.out.println("Test Failed");
       
           /*
        * Name: Factorial
        * Purpose: To identify the factorial of a number
        * Inputs: n = 5
        * Expected Output: 120
        */
       System.out.println("");
       System.out.println("");
       long factorialResult = MyMath.Factorial(5);
       long factorialExpected = 120;
       System.out.println("Method Name: Factorial");
       System.out.println("Description: To get the facotrial of an integer");
       System.out.println("The inputted values were: MyMath.Factorial(5)");
       System.out.println("The result is: " + factorialResult);
       System.out.println("The Expected result was: " + factorialExpected);
       if (factorialResult==factorialExpected)
        System.out.println("Test Passed");
       else System.out.println("Test Failed");
       
       
          /*
        * Name: n Choose k 
        * Purpose: To preform the operation n choose k
        * Inputs: n = 12, k = 5
        * Expected Output: 792
        */
       System.out.println("");
       System.out.println("");
       long  biCoeffResult = MyMath.biCoeff(12,5);
       long  biCoeffExpected = 792;
       System.out.println("Method Name: N Choose K");
       System.out.println("Description: To preform N choose K");
       System.out.println("The inputted values were: MyMath.biCoeff(12,5)");
       System.out.println("The result is: " + biCoeffResult);
       System.out.println("The Expected result was: " + biCoeffExpected);
       if (biCoeffResult==biCoeffExpected)
        System.out.println("Test Passed");
       else System.out.println("Test Failed");
       
       
           /*
        * Name: Power
        * Purpose: To put one number to the power of another 
        * Inputs: a = 2 , b = 4
        * Expected Output: 120
        */
         System.out.println("");
       System.out.println("");
       double powerResult = MyMath.power(2,4);
       double powerExpected = 16;
       System.out.println("Method Name: Power");
       System.out.println("Description: To put one number to the power of another");
       System.out.println("The input values were: MyMath.sum(2,4)");
       System.out.println("The result is: " + powerResult);
       System.out.println("The Expected result was: " + powerExpected);
       if (powerResult==powerExpected)
        System.out.println("Test Passed");
       else System.out.println("Test Failed");
       
       
           /*
        * Name: Sum
        * Purpose: To get the sum of the first n natural numbers from 1 to n.
        * Inputs: n = 8
        * Expected Output: 36
        */
       
       System.out.println("");
       System.out.println("");
       int sumResult = MyMath.sum(8);
       int sumExpected = 36;
       System.out.println("Method Name: Sum");
       System.out.println("Description: To get the sum of the first n natural numbers from 1 to n.");
       System.out.println("The input values were: MyMath.sum(8)");
       System.out.println("The result is: " + sumResult);
       System.out.println("The Expected result was: " + sumExpected);
       if (sumResult==sumExpected)
        System.out.println("Test Passed");
       else System.out.println("Test Failed");
       
       
         /*
        * Name: convertCelciusToFahreneheit
        * Purpose: To convert degrees celcius into fahrenheit.
        * Inputs: Celcius = 8
        * Expected Output: 120
        */
       
       System.out.println("");
       System.out.println("");
       double convertCelciusToFahrenheitResult = MyMath.convertCelciusToFahrenheit(8);
       double convertCelciusToFahrenheitExpected = -13.3333333;
       System.out.println("Method Name: Convert Degrees Celcius to Fahrenheit");
       System.out.println("Description: To Convert Degrees Celcius to Fahrenheit");
       System.out.println("The input values were: MyMath.convertCelciusToFahrenheitResult(8)");
       System.out.println("The result is: " + convertCelciusToFahrenheitResult);
       System.out.println("The Expected result was: " + convertCelciusToFahrenheitExpected);
       if (convertCelciusToFahrenheitResult==convertCelciusToFahrenheitExpected)
        System.out.println("Test Passed");
       else System.out.println("Test Failed");
       
       
       
        /*
        * Name: computeWindChillTempResult
        * Purpose: To Compute Wind Chill Temperature Result
        * Inputs: Celcius = 8
        * Expected Output: 6.657891423259375
        */
       
       System.out.println("");
       System.out.println("");
       double computeWindChillTempResult = MyMath.computeWindChillTemp(8.0,8.0); // must be changed to allow for 3 doubles
       double computeWindChillTempExpected = 6.657891423259375;
       System.out.println("Method Name: computeWindChillTemp");
       System.out.println("Description: To compute the temperature of the wind chill");
       System.out.println("The input values were: MyMath.computeWindChillTempResult(8,8)");//same here
       System.out.println("The result is: " +computeWindChillTempResult);
       System.out.println("The Expected result was: " + computeWindChillTempExpected);
       if (computeWindChillTempResult==computeWindChillTempExpected)
        System.out.println("Test Passed");
       else System.out.println("Test Failed");
       
       
       
         /*
        * Name: countNumberOfRealRoot
        * Purpose: To To find if an equation has real roots
        * Inputs: a = -4 , b = 12 , c = -9
        * Expected Output: 0
        */
       
       System.out.println("");
       System.out.println("");
       int countNumberOfRealRootsResult = MyMath.countNumberOfRealRoots(-4,12,-9);
       int countNumberOfRealRootsExpected = -216;
       System.out.println("Method Name: Arsem");
       System.out.println("Description: To find if an equation has real roots");
       System.out.println("The input values were: MyMath.sum(-4,12,-9)");
       System.out.println("The result is: " + countNumberOfRealRootsResult);
       System.out.println("The Expected result was: " + countNumberOfRealRootsExpected);
        if (countNumberOfRealRootsResult > 0)
        System.out.println("This equation has two real roots");
        else if ( countNumberOfRealRootsResult == 0)
        System.out.println("This equation has one real root");
        else 
        System.out.println("This equation has no real roots");
        
       if (countNumberOfRealRootsResult==countNumberOfRealRootsExpected)
        System.out.println("Test Passed");
       else System.out.println("Test Failed");
       
       
       
       
    }
    
    
    
    
}
