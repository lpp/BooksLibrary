package ru.lpp;

public class Main {

    public static void main(String[] args) {
        Writer wr1 = new Writer("Пушкин", "Александр");
        Writer wr2 = new Writer("Гоголь", "Николай");
        Book bk1 = new Book("Медный всадник", wr1);
        Book bk2 = new Book("Мертвые души", wr2);
        Book bk3 = new Book("Ночь перед Рождеством", wr2);
        Library lib = new Library();
        if(lib.isEmpty()) {
            System.out.println("Библиотека пустая");
        }

        lib.addNewBook(bk1);
        lib.addNewBook(bk2);
        lib.addNewBook(bk3);
        lib.showBooksList();
        System.out.println("Размер бибилиотека " + lib.size());
    }
}
