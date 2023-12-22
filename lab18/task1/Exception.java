package ru.mirea.lab18.task1;

public class Exception {
    public void exceptionDemo() {
        try{
            System.out.println( 2 / 0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }
}

