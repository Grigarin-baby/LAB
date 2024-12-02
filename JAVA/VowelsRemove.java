import java.util.Scanner;
public class VowelsRemove
{
public static void main(String args[])
{
String str1,str2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String");
str1=sc.nextLine();
str2=str1.replaceAll("[aeiouAEIOU]"," ");
System.out.println("All vowels removed successfully");
System.out.println(str2);
}
}