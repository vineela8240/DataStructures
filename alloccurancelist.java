package linearsearch;

import java.util.ArrayList;
import java.util.List;

public class alloccurancelist {
    public static List<Integer> AllOccuranceList(int arr[],int target){
        List<Integer> indices=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                indices.add(i);
            }
        }
        return indices;

    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,5,6,5,6,7,3,5};
        int target=7;
        List<Integer> result=AllOccuranceList(arr,target);
        System.out.println("The indices where "+target+ " appears in the array are "+result );
    }
}
