package ru.mirea.lab24.task3;

public class TextDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Opening text document");
    }

    @Override
    public void save() {
        System.out.println("Saving text document");
    }
}

