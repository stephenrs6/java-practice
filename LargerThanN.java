/**
 * LargerThanN
 */
public class LargerThanN {

    public static void LargerThanN(int arr[], int n) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]>n){
                System.out.println(arr[i]);

            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 2, 4, -3, 6};
        int[] arr2 = {10, 12, 15, 24};
        int n1= 3;
        int n2 = 12;

        LargerThanN(arr1, n1);
        LargerThanN(arr2, n2);
    }
}