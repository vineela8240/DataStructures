package binarysearch;

public class rotatedsortedarraytargetelement {
    public static boolean RotatedSortedArrayTargetElement(int[] num,int target){
        int left=0;
        int right=num.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(num[mid]==target){
                return true;
            }
            //Check if left side is sorted
            if(num[left]<=num[mid]){
                //Target is in the left half
                if(num[left]<=target&&target<num[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }

            }
            else{
                //Check if right half is sorted
                if(num[mid]<target&&target<=num[right]){
                    //Tartet is in right half
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num[]={4,5,6,6,0,1,2};
        int target=0;
        System.out.println(RotatedSortedArrayTargetElement(num,target));
        target=3;
        System.out.println();
    }
}
