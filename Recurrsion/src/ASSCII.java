public class ASSCII {
    public static void main(String[] args) {

    }
    static void subseqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseqAscii(p,up.substring(1));
        subseqAscii(p+ch,up.substring(1));
        subseqAscii(p+(ch+0),up.substring(1));//to convert character into ascii add 0
    }
}
