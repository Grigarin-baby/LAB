import java.util.Scanner;

public class HcfLcm {
    public static void main(String args[]) {
        int temp1, temp2, num1, num2, temp, hcf, lcm;
        Scanner sc = new Scanner(System.in);
        System.out.println("EnterFirstNumber");
        num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        num2 = sc.nextInt();
        sc.close();
        temp1 = num1;
        temp2 = num2;
        while (temp2 != 0) {
            temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }
        hcf = temp1;
        lcm = (num1 * num2) / hcf;
        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
    }
}