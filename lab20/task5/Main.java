package ru.mirea.lab20.task5;

public class Main {
    public static void main(String[] args) {
        Integer[][] data1 = {{1, 2, 3}, {4, 5, 6}};
        Integer[][] data2 = {{7, 8, 9}, {10, 11, 12}};

        Matrix<Integer> matrix1 = new Matrix<>(data1);
        Matrix<Integer> matrix2 = new Matrix<>(data2);

        System.out.println("Matrix 1:");
        System.out.println(matrix1);

        System.out.println("Matrix 2:");
        System.out.println(matrix2);

        Matrix<Integer> sumResult = matrix1.add(matrix2);
        System.out.println("Sum Result:");
        System.out.println(sumResult);

        try {
            Matrix<Integer> productResult = matrix1.multiply(matrix2);
            System.out.println("Product Result:");
            System.out.println(productResult);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
