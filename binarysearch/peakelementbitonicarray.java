package binarysearch;

public class peakelementbotanicarray {
    public static int PeakElementBotaniArray(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            //Check  if the mid is the peakelement
            if(mid==0 || arr[mid-1]<=arr[mid]&&(mid==arr.length-1||arr[mid+1]<=arr[mid])){
                return mid;
            }
            else if(mid>0&&arr[mid-1]>arr[mid]){
                //if the left neighbor is greater ,move to left half
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int botanicArray[]={1,2,9,13,5,3};
        int peakIndex=PeakElementBotaniArray(botanicArray);
        System.out.println(peakIndex);
    }
}
