package ex_16_Arrays;

public class Lab123_Arrays {
    public static void main(String[] args) {
        int a = 10;

        int marks[] = {23,58,69,98,100,15};
        int[] mark = {23,58,69,98,100,15};

        boolean is_married_couple[] = {true, true, false};
        String names[] = {"Mohana", "Priya", "Sundar"};

        float[] values = {3.14f, 5.12f, 56.0f};

        float value[] = new float[3];
        value[0] = 3.14f;
        value[1] = 5.6f;
        value[2] = 6.2f;

        //Traverse

        for(String name : names) {
            System.out.println(name);
        }
    }
}
