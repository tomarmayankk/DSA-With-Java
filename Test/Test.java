package Test;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coordinates of the quadrilateral (x1 y1 x2 y2 x3 y3 x4 y4):");
        int[] coordinates = new int[8];
        for (int i = 0; i < 8; i++) {
            coordinates[i] = scanner.nextInt();
        }

        double area = calculateArea(coordinates);
        System.out.println("Area of the quadrilateral: " + area);

        scanner.close();
    }

    public static double calculateArea(int[] coordinates) {
        // Shoelace formula
        double area = 0.5 * Math.abs(
                coordinates[0] * coordinates[3] + 
                coordinates[2] * coordinates[5] + 
                coordinates[4] * coordinates[7] + 
                coordinates[6] * coordinates[1] -
                (coordinates[2] * coordinates[1] + 
                 coordinates[4] * coordinates[3] + 
                 coordinates[6] * coordinates[5] + 
                 coordinates[0] * coordinates[7])
        );
        return area;
    }
}
