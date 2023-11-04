import java.util.Arrays;

public class arraypractice {
    static int[] smallandlarge(int []arr){
        Arrays.sort(arr);
        int []ans={arr[0],arr[arr.length-1]};


        System.out.printf("Smallest and largest :%d %d",arr[0],arr[arr.length-1]);
//        System.out.println("lasrgest :"+);
        return ans;
    }
    static void arraysort(int[]arr){//for sorting the array by inbuilt method.
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static void  maxarray(int []arr){
        int min=arr[0];
        int ans=0;
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){//mininum array
                min=arr[i];
            }else if(arr[i]>ans){//maximum array
                ans=arr[i];
            }
        }
        System.out.printf("%d %d",min,ans);
    }
    public static void main(String[] args) {
        int []arr={3,2,1,56,10000,167};
//        maxarray(arr);
//        arraysort(arr);
            smallandlarge(arr);
    }
}
