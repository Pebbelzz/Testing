/**
 * Created by Josie on 7/18/2017.
 */
public class ReplaceAllTheDots {
    public static void main(String args[]){
        replaceDots("one.two.three");
    }

    public static String replaceDots(final String str){
        System.out.println(str.replace(".", "-"));
        return str.replace(".", "-");
    }
}
