import java.util.*;

class ExceptionDemo1XX
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int no1 = 0, no2= 0, Ans=0;

        try
        {
            System.out.println("Enter First Number:");
            no1 = sobj.nextInt();

            System.out.println("Enter Second Number:");
            no2 = sobj.nextInt();

            Ans = no1/no2;                              // Exception Prone code
        }
        catch(ArithmeticException aobj)                 // aobj will catch
        {
            System.out.println("Exception occured:"+aobj);
        }
        catch(Exception eobj)
        {
           System.out.println("Inside Generic catch:");
 
        }
        finally
        {
            System.out.println("Inside finally block:");
        }

        System.out.println("Division is:"+Ans);

    }
}