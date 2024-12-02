import java.util.Scanner;

class Student {
    int admno;
    Scanner sc;

    Student() {
        sc = new Scanner(System.in);
    }

void read()
{
System.out.println("Enter Admno:");
admno = sc.nextInt();
}

void display()
{
System.out.print(admno + "\t");
}
}

class Mark extends Student {
    int mark[];
    int total;
    int avg;
    int i;
    String result;

    Mark() {
        super();
        mark = new int[5];
        total = 0;
        avg = 0;
    }

void read()
{
super.read();
System.out.println("Enter 5 subject marks....");
for (i = 0; i < 5; i++)
{
System.out.println("Enter subject[" + (i + 1) + "]:");
mark[i] = sc.nextInt();
}
}

void calculate()
{
for (i = 0; i < 5; i++)
{
total = total + mark[i];
}
avg = total / 5;
if (total >= 175)
{
result ="PASSED";
}
else
{
result = "FAILED";
}
}

void display()
{
super.display();
System.out.println("\t" + result);
}
}

class P11 {
public static void main(String[] args)
{
Mark m[];
int j = 0;
int n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number of Students:");
n = sc.nextInt();
m = new Mark[n];
for (j = 0; j < n; j++)
{
m[j] = new Mark();
System.out.println("Enter [" + (j + 1) + "] Student details.....");
m[j].read();
m[j].calculate();
}
System.out.println("Student Details");
System.out.println("Admno\tResult");
for (j = 0; j < n; j++)
{
m[j].display();
}
}
}