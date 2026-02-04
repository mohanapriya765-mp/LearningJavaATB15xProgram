package A_Exam_18_Jan_2026;

public class Ex1_Count_Characters_in_a_String {
    public static void main(String[] args) {
        String str = "Mohana Priya Sundar Medhashree   Hridhan";
        System.out.println("String length before removing space: "+str.length());
        // 1st way
        String re = str.replace(" ", "");
        System.out.println("String length after removing space: "+re.length());

        // 2nd way
        int count = 0;
        for (int i=0; i< str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}
