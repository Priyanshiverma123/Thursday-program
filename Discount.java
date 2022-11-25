import java.util.Scanner;
public class Discount
{
   public static void main(String[] args)
   {
      float totalcost,costtopaid,discount;
      Scanner scan = new Scanner(System.in);
      System .out.println("enter the total amount of shopping:");
      totalcost = scan.nextFloat();
      if(totalcost<=800)
      {
         costtopaid = totalcost;
      }
      else if(totalcost>800 && totalcost<=1500)
      {
       discount = (totalcost*10)/100;
       costtopaid = totalcost - discount;
      }
      else if(totalcost>1500 && totalcost<=2500)
      {
       discount = (totalcost*15)/100;
       costtopaid = totalcost - discount;
      }
      else if(totalcost>2500 && totalcost<=5000)
      {
       discount = (totalcost*20)/100;
       costtopaid = totalcost - discount;
      }
      else
      {
       discount = (totalcost*30)/100;
       costtopaid = totalcost - discount;
      }
      System .out.println("the cost to be paid is:" + costtopaid);
   }
}