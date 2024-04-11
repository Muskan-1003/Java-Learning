public class SpecialCharReverse {
//    Special array reversal
//    EasyAccuracy: 40.46%Submissions: 16K+Points: 2
//    Given a string S, containing special characters and all the alphabets, reverse the string without
//    affecting the positions of the special characters.
//
//            Example 1:
//
//    Input: S = "A&B"
//    Output: "B&A"
//    Explanation: As we ignore '&' and
//    then reverse, so answer is "B&A".


    class Solution
    {
        public String reverse(String str)
        {
            String s="";
            char[] a = str.toCharArray();
            int start = 0;
            int end = str.length() - 1;
            while (start < end) {
                if (Character.isLetter(a[start]) && Character.isLetter(a[end])) {
                    char temp = a[start];
                    a[start] = a[end];
                    a[end] = temp;
                    start++;
                    end--;
                }else if(!Character.isLetter(a[start])){
                    start++;
                }else if(!Character.isLetter(a[end])){
                    end--;
                }
            }
            return new String(a);
        }
    }
}
