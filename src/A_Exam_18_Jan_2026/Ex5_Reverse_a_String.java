package A_Exam_18_Jan_2026;

public class Ex5_Reverse_a_String {
    public static void main(String[] args) {
        String str = "Mohana";
        String rev = "";
        for (int i = str.length()-1; i>=0; i--){
            rev = rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}
