import java.util.*; import
java.lang.Math;
class Traingle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
double area,s,val;
System.out.println("Enter 3 sides:");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a<b+c && b<a+c && c<a+b)
{
if(a==b && b==c)
System.out.println("Equilateral triangle");
else if(a==b || b==c || c==a)
System.out.println("Isosceles triangle");
else
System.out.println("Scalene triangle");
s=(a+b+c)/2;
val=s*(s-a)*(s-b)*(s-c);
area=Math.sqrt(val);
System.out.println("Area of the triangle is:"+area);
}
System.out.println(" Can not form a triangle");
}
}