public class OddSelector
{
   public static void main(String[] args)
   {
      System.out.println("These are the odd numbers from 1 to 100.");
      System.out.println("Ready?");
      //for values from 1 to 100
      for (int value = 2; value <= 100; value += 2)
      {
         System.out.println(value); //print them
      }
      System.out.println("That was fast!");
   }
}