import java.io.*;

import java.util.Scanner;
public class String_reverse 

{
public static void main(String args[])

{

Scanner s=new Scanner(System.in);
String a=s.nextLine();
StringBuffer s1=new StringBuffer(a);


s1.reverse();
System.out.println(s1);

}

}
