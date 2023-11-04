import java.util.Arrays;
import java.util.Scanner;
public class techncodes {

    static int finduniquee(int[]arr){
//        int ans=-1;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
                }
            }
        int ans=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                ans=arr[i];
            }

        }
        return ans;
    }
    static int countpair(int []arr){
        int ans=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==arr[i+1]){
                    ans++;
                }

        }
        return ans;
    }
    static void minarr(int []arr){
        Arrays.sort(arr);
        System.out.println(arr[0]);

        }

    //count the number of elements strictly greater than the value of x
    static int countgreat(int []arr,int x){
        int count=0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]>x){
                count++;
            }
        }
        return count;
    }
    static void findlength(int []arr){
        System.out.println(arr.length);
    }
    static int lastoccur(int []arr,int x){//check where the x placed in last where
        int lastindex=-1;
        for (int i=0; i<arr.length; i++){
            if(arr[i]==x){
                lastindex=i;
            }
        }
        return lastindex;
    }
    static int countoccur(int []arr,int x){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
    static void maxarray(int []arr){
        int ans=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println("greater : "+ans);
    }
    static  void arrsum(int []arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println("sum of the array :"+sum);
    }
    static void compound(int p,int r,int t){
        int l=(r/100)*(r/100);

        int n=p+(1+l);
        System.out.println(n);
    }

    static int findmax(int[]arr){
        int max=Integer.MIN_VALUE;//FOR FINDING THE MAXIMUM VALUE IN THE ARRAY
        for (int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int findunique (int []arr){//find the unique element in the given array
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter any number :");
//        int n=sc.nextInt();

        for(int i=1; i<=100; i++){
            if(i%2==1 || i%6==0){
                System.out.println(i);

            }
        }
//        System.out.println("enter the size of the array :");
//        int n=sc.nextInt();
//        int []arr=new int[n];
//        System.out.println("enter the elements of the array : ");
//        for(int i=0; i<arr.length; i++){
//            arr[i]=sc.nextInt();
//        }
//        arr[0]=-2;
//        arr[1]=-10;
//        arr[2]=-4;
//        arr[3]=1;
//        arr[4]=5;
//        arr[5]=8;
//        System.out.println("unique element : "+findunique(arr));
//        System.out.println("maximum is :"+findmax(arr));
//        System.out.println(finduniquee(arr));
//        countpair(arr);
//        minarr(arr);
//        findlength(arr);
//        System.out.println("enter the occur value : ");
//        int x=sc.nextInt();
//        System.out.println(countgreat(arr,x));
//        compound(2500,10,2);
//        maxarray(arr);
//        System.out.println( lastoccur(arr,x));
//        arrsum(arr);
    }
}
