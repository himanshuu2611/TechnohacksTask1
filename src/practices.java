import java.util.Scanner;
public class practices {

    static void maxarray(int []arr){
        int ans=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println("maximum element is :"+ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] tt=new int[6];
        for(int i=0; i< tt.length; i++){
             int []arrr= new int[]{sc.nextInt()};
        }
      maxarray(tt);

        }
    }

