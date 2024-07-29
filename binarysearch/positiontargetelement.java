package binarysearch;

public class positiontargetelement {
    public static int PositionTargetElement(int arr[],int target,int left,int right){

        if(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
               return PositionTargetElement(arr,target,mid+1,right);
            }
            else{
                return PositionTargetElement(arr,target,mid-1,left);
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int sortedArray[]={1,2,3,4,5,6,7,8,9};
        int targetelement=7;
        int result=PositionTargetElement(sortedArray,targetelement,0, sortedArray.length-1);
        if(result!=-1){
            System.out.println("Elenet Found at Index:  "+result);
        }
        else{
            System.out.println("Postion of the target element is not found!");
        }

    }
}
