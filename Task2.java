import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt(); // задаем кол-во строк
        int[][] nums = new int[numRows][]; // Создаем двумерный массив nums, numRows - число строк
        for (int i = 0; i < numRows; i++) {
            nums[i] = new int[i + 1]; //новый массив для строки
            nums[i][0] = 1; //первый элемент массива
            nums[i][i] = 1; //последний элемент массива
            for (int j = 1; j < i; j++) {
                nums[i][j] = nums[i - 1][j - 1] + nums[i - 1][j]; //сумма двух вышестоящих
            }
        }
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(nums[i][j] + " "); //вывод треугольника
            }
            System.out.println();
        }
    }
}

