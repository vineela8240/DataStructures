package binarysearch;

public class firstlastoccurance{

    public static int FindFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // Move left to find the first occurrence
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    public static int FindLastOccurance(int arr[],int target){
        int left=0;int right=arr.length-1;
        int result=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                result=mid;
                left=mid+1;

            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 4, 5};
        int target = 5;
        System.out.println("First occurrence of " + target + " is at index: " + FindFirstOccurrence(arr, target));
        System.out.println("Last occurrence of " + target + " is at index: " + FindLastOccurance(arr, target));

    }
}
