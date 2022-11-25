import java.util.Scanner;
public class Electricty
{
 public static void main(String[] args)
  {
    int units;
    double billtopay = 0;
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number of units");
  units = sc.nextInt();
  if (units <= 100) 
  {
   billtopay = units * 10;
  }
  else if(units <= 200)
  {
   billtopay = 100*10+(units-100)*15;
  }
  else if(units <= 300)
  {
   billtopay = 100*10+100*15+(units-200)*20;
  }
  else if(units > 300)
  {
   billtopay = 100*10+100*15+100*20+(units-3000)*25;
  }
  System.out.println("the electricty bill for"+units+"is:"+billtopay);
    }
}