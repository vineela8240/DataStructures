package linearsearch;

public class BasicLinearSearch {
 public static int linearsearch(int arr[],int target){
     for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            return i;
        }
     }
     return -1;

 }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int targetElement=40;
        int result=linearsearch(arr,targetElement);
        if(result!=-1){
            System.out.println("Element" +targetElement+ "Found at:"+result);
        }
        else{
            System.out.println("element not Found");
        }
    }
}
