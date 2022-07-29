package answer1;

public class Answer1 {

    // public static void main() {     // we can't make another method within a main method

    private static String compareStringValues(String value)
    {

        if (value.equals("MOM"))
            return "MOM";
        else
            return "DAD";
    }

    public static void main(String[] args) {
        System.out.println(compareStringValues("MOM"   +  "cook food for me"));
    }

}
//  there is no any Null point exception
