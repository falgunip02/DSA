public class RotationCount {

        public static void main(String[] args) {
            int[] arr = {4,5,0,1,2};
            System.out.println(countRotation(arr));
        }


    private static int countRotation(int[] arr){
       int pivot = findPivot(arr);
        return pivot + 1;

    }
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>= arr[mid] ){
                end = mid - 1 ;
            }
            else {
                start = mid +1;
            }
        }
        return  -1;

    }
}
