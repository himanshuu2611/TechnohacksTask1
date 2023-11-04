import java.util.Scanner;
public class arraydsapractice4 {
    static int pairsum(int []arr, int target){//check how many pairs for a given target value .
        int n=arr.length;
        int ans=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }
    static int tripletpair(int []arr,int target){
        int ans=0;
        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                for (int k=j+1; k<arr.length; k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;

                    }
                }
            }
        }
        return ans;
    }
    //create method for finding unique element in the given array.
    static int findunique(int []arr){
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
    static int findmax(int[]arr){
        int max=Integer.MIN_VALUE;//FOR FINDING THE MAXIMUM VALUE IN THE ARRAY
        for (int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int secmax(int []arr){//for finding the second maximum value int the given array.
        int max=findmax(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondmax=findmax(arr);
        return secondmax;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the size :");
        int n=sc.nextInt();
    int []arr=new int[n];
        System.out.println("enter the elements :");
        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
//        System.out.println("enter the target value :");
//        int target=sc.nextInt();
//        System.out.println("paired : "+pairsum(arr,target));
//        System.out.println("triplets : "+tripletpair(arr,target));
//        System.out.println("unique element is : "+findunique(arr));
//        System.out.println("maximum : "+findmax(arr));
//        System.out.println("second maximum : "+secmax(arr));
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
