package Top_Interview_Questions; //java program to reverse a string and check for vowels
public class reverseStr {
    public static void main(String[] args){
        String str = "Hll";
        System.out.println(reveString(str));
        System.out.println(hasVowel(str));
    }
    //function to reverse the string
    static String reveString(String str){
        char [] chararray = str.toCharArray();
        int start = 0;
        int end = chararray.length - 1;
        while (start < end) {
            //swap
            char temp = chararray[start];
            chararray[start] = chararray[end];
            chararray[end] = temp;
            start++;
            end--;
        }
        return new String(chararray);
    }
    //function to check for the vowels
    static boolean hasVowel(String str){
        if(str.toLowerCase().matches(".*[aeiou].*")){
            return true;
        }
        return false;
    }
}

