package linearsearch;

public class firstnonduplicatecharacter {
    public static char FirstNonDuplicateCharacter(String input){
        int[] charCount=new int[256]; //Assuming array values

           //Initialsing the array with zeros
        for (int i=0;i<charCount.length;i++){
            charCount[i]=0;
        }
          //Traverse the input string and update the character count
        for (int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            charCount[ch]++;
        }
        //To find the first duplicate character
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(charCount[ch]==1){
                return ch;
            }
        }
        return '\0';

    }

    public static void main(String[] args) {
        String input="abacdbef";
        char result=FirstNonDuplicateCharacter(input);
        System.out.println(result);
    }
}
