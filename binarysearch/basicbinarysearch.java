package binarysearch;

public class basicbinarysearch {
    public static int BasicBinarySearch(int arr[],int target){
        int left=0;
        int right= arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int sortedArray[]={20,23,24,25,26,27,28};
        int targetElement=24;
        int result=BasicBinarySearch(sortedArray,targetElement);
        if(result!=-1){
            System.out.println("Element Found at Index" +result);
        }
        else{
            System.out.println("Element not found!");
        }
    }
}
