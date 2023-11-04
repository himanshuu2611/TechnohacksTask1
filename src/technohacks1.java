import java.util.Scanner;

public class technohacks1 {
    static void binary(int n) {
        int t=n;
        int i=0;
        int d=0;
        while(t>0){
            int r=t%10;
            t=t/10;
            d=d+r*(int)Math.pow(2,i++);
        }
        System.out.println("decimal number of " + n + " is : " + d);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to our software !");
        System.out.println("enter the binary number :");
        int n=sc.nextInt();

        binary(n);

            }
        }

