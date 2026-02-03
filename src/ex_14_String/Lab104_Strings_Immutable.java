package ex_14_String;

public class Lab104_Strings_Immutable {
    public static void main(String[] args) {
        String name = "Mohana";
        name = "Priya";  // Now the name will be "Priya" , it is override but the 1st string is not yet deleted. Just new string is created.
        boolean res = name.contains("r");
        System.out.println(res);

        name.toUpperCase();
        System.out.println(name); // This will still print the result as "Priya" because the assignment is not happend, so it won't convert to uppercase


        String n = name.toUpperCase(); //new string will be created , existing will not get updated. This is why Strings are immutable.
        System.out.println(n); // Now it will print is uppercase as the assignment is done. "PRIYA"



    }
}
