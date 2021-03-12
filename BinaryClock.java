import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
/**
 * Write a description of class BinaryClock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
  public class BinaryClock
{
    String caso;
   static Scanner l = new Scanner(System.in);
   String hour1;
   String hour2;
   String minute1;
   String minute2;
   String second1;
   String second2;
   
   int h1;
   int h2;
   int m1;
   int m2;
   int s1;
   int s2; 
    public static void main()
   {
       System.out.print('\u000c');
       BinaryClock clock = new BinaryClock();
       
       System.out.println("Número de Casos:");
       int casos = l.nextInt();
       int x = 0;
       do 
       {
           System.out.println("Input:");
           clock.Read();
           clock.Convert();
           clock.Parse();
           clock.Print();
           x++;
       }
       
       while (x < casos);
   }
   
   public void Read()
   {
       caso = l.next();           
   }
   
   public void Convert()
   
   {
       int a [] = {2,2,2,2,2,2};
      
        if (caso.length() <= 54)
       {
       
           hour1 = caso.substring(0, StringUtils.ordinalIndexOf(caso, "(", 3));
           hour2 = caso.substring(StringUtils.ordinalIndexOf(caso, "(", 3), StringUtils.ordinalIndexOf(caso, "(", 7));
           minute1 =  caso.substring(StringUtils.ordinalIndexOf(caso, "(", 7), StringUtils.ordinalIndexOf(caso, "(", 10));
           minute2 = caso.substring(StringUtils.ordinalIndexOf(caso, "(", 10), StringUtils.ordinalIndexOf(caso, "(", 14));
           second1 = caso.substring(StringUtils.ordinalIndexOf(caso, "(", 14), StringUtils.ordinalIndexOf(caso, "(", 17));
           second2 = caso.substring(StringUtils.ordinalIndexOf(caso, "(", 17), caso.length());
           
           for (int i = 0; i < hour1.length()-1; i++)
           {
               if(hour1.substring(i,a[0]).equals("()"))
               {
                   hour1+= "0";
                   
               }
               if(hour1.substring(i,a[0]).equals("(*"))
               {
                   hour1+="1";
               }
               a[0]++;
           }
           for (int i = 0; i < hour2.length()-1; i++)
           {
               if(hour2.substring(i,a[1]).equals("()"))
               {
                   hour2+= "0";
                   
               }
               if(hour2.substring(i,a[1]).equals("(*"))
               {
                   hour2+="1";
               }
               a[1]++;
           }
           for (int i = 0; i < minute1.length()-1; i++)
           {
               if(minute1.substring(i,a[2]).equals("()"))
               {
                   minute1+= "0";
                   
               }
               if(minute1.substring(i,a[2]).equals("(*"))
               {
                   minute1+="1";
               }
               a[2]++;
           }
           for (int i = 0; i < minute2.length()-1; i++)
           {
               if(minute2.substring(i,a[3]).equals("()"))
               {
                   minute2+= "0";
                   
               }
               if(minute2.substring(i,a[3]).equals("(*"))
               {
                   minute2+="1";
               }
               a[3]++;
           }
           for (int i = 0; i < second1.length()-1; i++)
           {
               if(second1.substring(i,a[4]).equals("()"))
               {
                   second1+= "0";
                   
               }
               if(second1.substring(i,a[4]).equals("(*"))
               {
                   second1+="1";
               }
               a[4]++;
           }
           for (int i = 0; i < second2.length()-1; i++)
               {
                   if(second2.substring(i,a[5]).equals("()"))
                   {
                       second2+= "0";
                       
                   }
                   if(second2.substring(i,a[5]).equals("(*"))
                   {
                       second2+="1";
                   }
                   a[5]++;
               }
           hour1 = hour1.substring( StringUtils.ordinalIndexOf(hour1, ")", 2)+1, hour1.length());
           hour2 = hour2.substring( StringUtils.ordinalIndexOf(hour2, ")", 4)+1, hour2.length());
           minute1 = minute1.substring( StringUtils.ordinalIndexOf(minute1, ")", 3)+1, minute1.length());
           minute2 = minute2.substring( StringUtils.ordinalIndexOf(minute2, ")", 4)+1, minute2.length());
           second1 = second1.substring( StringUtils.ordinalIndexOf(second1, ")", 3)+1, second1.length());
           second2 = second2.substring( StringUtils.ordinalIndexOf(second2, ")", 4)+1, second2.length());
        }
        else
        {
            System.out.println("Invalid Input");
        }
   }   
   public void Parse()
   {
       h1 = Integer.parseInt((String)hour1,2);
       h2 = Integer.parseInt((String)hour2,2);
       m1 = Integer.parseInt((String)minute1,2);
       m2 = Integer.parseInt((String)minute2,2);
       s1 = Integer.parseInt((String)second1,2);
       s2 = Integer.parseInt((String)second2,2);
   }
   public void Print()
   {
       System.out.print(h1);
       System.out.print(h2 + ":");
       System.out.print(m1);
       System.out.print(m2 + ":");
       System.out.print(s1);
       System.out.println(s2);
   }
}
