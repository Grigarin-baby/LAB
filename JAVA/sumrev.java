import java.util.Scanner;
class SumRev
{
int rem,m,sum;
SumRev()
{
m=0;
sum=0;
rem=0;
}
void reverse(int n)
{
do
{
rem=n%10;
m=m*10+rem;
n=n/10;
}
while(n>0);
System.out.println("Reverse = " +m);
}
void digit(int n)
{
rem=0;
do
{
rem=n%10;
sum=sum+rem;
n=n/10;
}
while(n>0);
System.out.println("Sum of digit = " +sum);
}
}
class Prgm12
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number");
int num=sc.nextInt();
SumRev obj=new SumRev();
obj.reverse(num);
obj.digit(num);
}
}