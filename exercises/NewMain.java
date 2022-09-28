package exercises;
import java.util.Scanner;
public class NewMain {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int id,age;
       boolean x=true;
       while(x)
       {
           System.out.println("=====================");
           try
           {
           System.out.println("Enter the Id-number:");
           id=sc.nextInt();
           System.out.println("Enter the Age:");
           age=sc.nextInt();
           try
           { 
           if(id==0&&age==0)
           {
                x=false;
           }    
           else if(id<1||id>999||age<1||age>119)
           {
                throw new DataEntryException("Invalid Age or Id-num");
           }
           else if(id>0||id<1000||age>0||age<119)
           {
               System.out.println("*****VALID*****");
               System.out.println("ID:"+id);
               System.out.println("AGE:"+age);
           }   
           }
           catch(DataEntryException de)
           {
               System.out.println("----"+de.getMessage()+"----");
           }
           }
           catch(Exception e)
           {
               System.out.println("Input Mismatch");
               x=false;
           }
       }
    }    
}
class DataEntryException extends Exception
{
DataEntryException(String msg)
{
super(msg);
}
}