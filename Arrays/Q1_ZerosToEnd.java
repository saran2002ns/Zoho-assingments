import java.util.Arrays;

public class Q1_ZerosToEnd {
    public static void main(String[] args) {
        int arr[] ={0,1,0,3,12};
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp =arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                k++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
