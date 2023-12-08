public class Stream {
    public static void main(String[] args) {
       skip("","bbabaa");
        System.out.println(skip("bbacd"));
    }
    static void skip(String p, String up){//up-orignal, p-modified--also initalise with empty
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);

        if(ch=='a'){
            skip(p,up.substring(1));//substring removes one character i.e substring from index no. 1

        }else{
            skip(p+ch,up.substring(1));
        }

    }
    //another approach//not passed in argument
    static String skip(String up){//up-orignal, p-modified--also initalise with empty
        if(up.isEmpty()){

            return" ";
        }

        char ch=up.charAt(0);

        if(ch=='a'){
           return skip(up.substring(1));//substring removes one character i.e substring from index no. 1

        }else{
           return ch+ skip(up.substring(1));
        }

    }
    //skip string apple
    static String skipApple(String up){//up-orignal, p-modified--also initalise with empty
        if(up.isEmpty()){

            return" ";
        }
        if(up.startsWith("apple")){
           return skipApple(up.substring(5));//substring removes one character i.e substring from index no. 1

        }else{
           return up.charAt(0)+ skipApple(up.substring(1));
        }

    }
    // app not apple
    static String skipAppNotApple(String up){//up-orignal, p-modified--also initalise with empty
        if(up.isEmpty()){

            return" ";
        }
        if(up.startsWith("app")&& !up.startsWith("apple")){
           return skipAppNotApple(up.substring(3  ));//substring removes one character i.e substring from index no. 1

        }else{
           return up.charAt(0)+ skipAppNotApple(up.substring(1));
        }

    }
}
