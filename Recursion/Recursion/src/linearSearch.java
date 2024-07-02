public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8};
        int ans = search(arr,0, 5);
        System.out.println(ans);
    }

    public static int search(int[] arr,int index,int key) {
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == key) {
            return index;
        }
        return search(arr,index+1,key);
        }
    }
