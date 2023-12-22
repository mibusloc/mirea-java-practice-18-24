package ru.mirea.lab19.task1;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String fullName = scanner.nextLine();
        System.out.print("Введите номер ИНН: ");
        String inn = scanner.nextLine();

        try {
            validateInn(inn);
            System.out.println("Номер ИНН действителен.");
        } catch (InvalidInnException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static void validateInn(String inn) throws InvalidInnException {
        String innPattern = "\\d{12}";

        Pattern pattern = Pattern.compile(innPattern);
        Matcher matcher = pattern.matcher(inn);

        if (!matcher.matches()) {
            throw new InvalidInnException("Недействительный ИНН. ИНН должен состоять из 12 цифр.");
        }
    }

    private static class InvalidInnException extends Exception {
        public InvalidInnException(String message) {
            super(message);
        }
    }
}

