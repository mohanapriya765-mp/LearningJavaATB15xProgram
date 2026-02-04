package Coding_task;

public class task12_Reverse_String {
    public static void main(String[] args) {
        String s1 = "Madam";
        String reverse = "";
        for(int i = s1.length()-1 ; i>=0; i--){
            reverse = reverse+s1.charAt(i);
        }
        System.out.println(reverse);

        if(reverse.equalsIgnoreCase(s1))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
