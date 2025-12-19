import java.util.Scanner;

public class ExampleFor3DArray {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int age[][][] = new int[2][3][4];

        // Input
        for (int i = 0; i < age.length; i++) {
            for (int j = 0; j < age[i].length; j++) {
                for (int k = 0; k < age[i][j].length; k++) {
                    System.out.println(
                        "Enter age for classroom " + i + " branch " + j + " student " + k
                    );
                    age[i][j][k] = s.nextInt();
                }
            }
        }

        // Output
        System.out.println(".......... Ages are ..........");

        for (int i = 0; i < age.length; i++) {
            for (int j = 0; j < age[i].length; j++) {
                for (int k = 0; k < age[i][j].length; k++) {
                    System.out.println(age[i][j][k]);
                }
            }
        }

        s.close();
    }
}
