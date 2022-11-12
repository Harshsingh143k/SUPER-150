import java.util.Arrays;

public class leetCode40 {
    public static void main(String[] args) {
        int[] arr={10,1,2,7,6,1,5};
        int target=8;
        Arrays.sort(arr);
    }
    public static void combinational(int[] arr,int target,String ans,int idx){
        if(target==0){
            System.out.println(ans);
            return;
        }
        for (int i = idx; i <arr.length ; i++){
            if(i!=idx && arr[i]==arr[i-1]){
                continue;
            }
            if(target>=arr[i]){
                combinational(arr,target-arr[i],ans+arr[i]+" ",i+1);

            }

        }


    }
}
