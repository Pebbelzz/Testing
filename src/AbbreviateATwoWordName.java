public class AbbreviateATwoWordName {

    public static String abbrevName(String name) {
        name = name.substring(0, 1) + "." + name.substring(name.indexOf(" ") + 1, name.indexOf(" ")+ 2);
        name = name.toUpperCase();
        return name;
    }
    public static void main(String[] args) {
        System.out.println(AbbreviateATwoWordName.abbrevName("Sam Harris"));
    }
}
