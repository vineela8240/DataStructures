package linearsearch;

public class countcharacteroccurance {
    public static int CountCharacterOccurance(String input,char target){
        int count=0;
        for(char ch:input.toCharArray()){
            if(ch==target){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String inputString="HelloWorld";
        char targetCharacter='l';
        int result=CountCharacterOccurance(inputString,targetCharacter);
        System.out.println("The character "+targetCharacter+" appears " +result+"  times in the input string ");
    }

}
