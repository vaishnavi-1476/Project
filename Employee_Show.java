package Miniprojectsecond;
import java.util.*;
import java.io.*;


/************************ To Show details of Employee *********************/

class Employee_Show
{
  public void viewFile(String s) throws Exception
  {
    File file = new File("file"+s+".txt");
    Scanner sc = new Scanner(file);

    while (sc.hasNextLine())
     {
       System.out.println(sc.nextLine());
     }
   }
}
