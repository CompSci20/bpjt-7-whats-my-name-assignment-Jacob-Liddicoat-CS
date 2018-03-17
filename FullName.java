//Author: Jacob Liddicoat
//Date created: Mar 17 2018
import java.io.*;
import java.util.*;
public class FullName
{
 public static void main(String args[])
 {
  Scanner kbReader = new Scanner(System.in);
  System.out.print("Jacob Liddicoat");
  String s = kbReader.next();
  System.out.println("What is your first name?" + s);
  s = kbReader.next();
  System.out.println("What is your last name?" + s);
 }
}
