
/**
 * Write a description of class MyMath here.
 * 
 * @author (Reece Gavin) 
 * @version (Last modified 4/10/17)
 */
public class MyMath
    {
   

   public static double Mean4 (double a ,double b, double c, double d)
   {

   double sum =(( a +  b +  c +  d)/4) ;
   return sum;

  }


  public static int Max ( int a , int b , int c)
  {
    
    if(a > b && a > c)
    return a;
    else if (b > c && b > a)
    return b;
    else 
    return c;
 
    
  }



 public static double max ( double a , double b , double c)
  {
   if(a > b && a > c)
    return a;
    else if (b > c && b > a)
    return b;
    else 
    return c; 
    
    
  }

 public static long Factorial (int n)
 {
  long result = 1;
  int counter = 2;
  while (counter <=n)
  {
      result = result * counter;
      counter++;
    }
    return result;
 }
    
    
    public static long biCoeff ( int n , int k)
    {
    
     long result = 1;
     int counter = 2;
     long result2 = 1;
     int counter2 = 2;
     int result3 =  1;
     int counter3 = 2;
     
     
     
     
     while (counter <=n)
        {
      result = result * counter;
      counter++;
       }
      
     while (counter3 <=n-k)
        {
      result3 = result3 * counter3;
      counter3++;
       }
      
      
      while (counter2 <=k)
      {
          result2 = result2 * counter2;
          counter2++;
       }
       
       
       return  result/(result2* result3);


      }


    public static double power( double a , int b)

    {
    
    
    double result = 1;
    
            for( int i = 0; i < b; i++)
            {
                
                
                     result *= a;
        
            }
    
                return result;
    
   
   }
   
   public static int sum ( int a )

    {
        int ab = a;
        int result = ((ab*(ab+1))/2);
    
        if( a < 0)
            return 0;
        else return result;
    
    
    

       }
   
   public static double convertCelciusToFahrenheit ( double celcius )

    {
        double Celcius = celcius;
        double result = (9.00/5.00) * celcius + 32;
    
        return result;
    
    

       }
       
        public static double computeWindChillTemp( double ambientTemp, double velocity)
    {
        double ambientTemp1 = ambientTemp;
        double velocity1 = velocity;
        double x = 0.16;
        double result = 0;
        double result1 = (13.12 + (0.6215 * ambientTemp) + 
        (-11.37 * result + (0.3965 * ambientTemp * result)));
        
        
        
            for( int i = 0; i < velocity; i++)
            {
                
                
                     result *= x ;
        
            }
    
                
    

        
        return result1;
    }

       
       
       
       
       
       
       
       
       public static int countNumberOfRealRoots( int a, int b, int c )

    {
       int coefficientofx = a;
       int coefficientofx2 = b;
       int coefficientofx3 = c;
       int result;
       
       
    
        
       result = (b*b) - (4*a*c);
       
       
    
        return result;
    
    

       }
       
   
  }


