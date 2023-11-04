import java.util.Arrays;
import java.util.Scanner;
public class arraydsa3 {
   static boolean issorted(int []arr){
       boolean check=true;
       for(int i=1; i<arr.length; i++){//check array is sorted or not 
           if(arr[i]<arr[i-1]){
               //not sorted
               check=false;
               break;
           }
       }
       return check;
   }
    static int countgreater(int []arr,int x){//find how many number greater than x
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>x){
                count++;
            }
        }
        return count;
    }
    static int lastoccur(int []arr,int x){//count the last indexes values int hea array
        int lastindex=-1;
        for (int i=0; i<arr.length; i++){
            if(arr[i]==x){
                lastindex=i;
            }
        }
        return lastindex;
    }
    static int countoccur(int[] arr, int x){//count the x occurs in the array
            int count=0;
            for(int i=0; i<arr.length; i++ ){
                if(arr[i]==x){
                    count++;
                }
            }
            return count;
    }
    static void printarray(int[]arr){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static void changearray(int[]arr){
        for(int i=0; i<arr.length; i++){
            arr[i]=0;
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int[]arr=new int[3];
//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;
//        System.out.println("original array : ");
//        printarray(arr);
//
////        int[]arr_2=arr.clone();//changed after given array
//        int []arr_2= Arrays.copyOf(arr, arr.length);
//        System.out.println("copied array : ");
//        printarray(arr_2);
//
//
//        //changing arr_2
//        arr_2[1]=4;
//        System.out.println("change after arr_2");
//        printarray(arr);
//        System.out.println("change  after arr_2");
//        printarray(arr_2);

        //question try this
        System.out.println("enter the size of array :");//declare the size of the array
        int n=sc.nextInt();

        int []aray=new int[n];
        System.out.println("enter "+n+"elements : ");//insert array
        for(int i=0; i<aray.length; i++ ){//taking iput of array
            aray[i]=sc.nextInt();
        };


//        System.out.println("enter the value of x :");//getting the value of x
//        int x=sc.nextInt();

//        System.out.println("count occurs :"+countoccur(aray,x));//call method
//        System.out.println("last index occurs "+lastoccur(aray,x));

//        System.out.println("greater than x : "+countgreater(aray,x)+" numbers ");
        System.out.println("is sorted "+issorted(aray));
    }
}
