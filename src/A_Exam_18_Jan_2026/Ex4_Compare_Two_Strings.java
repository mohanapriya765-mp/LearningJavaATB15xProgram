package A_Exam_18_Jan_2026;

public class Ex4_Compare_Two_Strings {
    public static void main(String[] args) {
        String str1 = "Mohana";
        String str2 = "mohana";
        String str3 = "mohana";
        String str4 = "Priya";

        System.out.println("String compared with case sensitive : " + str1.equals(str2));
        System.out.println("String compared with same string & case sensitive : " + str2.equals(str3));
        System.out.println("String compared by ignoring the case sensitive : " + str1.equalsIgnoreCase(str2));
        System.out.println("Different strings compared : " + str1.equals(str4));
    }
}
