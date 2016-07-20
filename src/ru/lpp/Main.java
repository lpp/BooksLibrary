package ru.lpp;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Library lib = new Library();
        if(lib.isEmpty()) {
            System.out.println("Библиотека пустая");
        }

        initLibrary(lib);
        lib.showBooksList();
        System.out.println("Размер библиотеки " + lib.size());

        Library searchLib = lib.SearchByTitle("Гоголь");
        searchLib.showBooksList();

    }

    static void initLibrary(Library lib ){

        Writer wr1 = new Writer("Пушкин", "Александр");
        Writer wr2 = new Writer("Гоголь", "Николай");
        Book bk1 = new Book("Медный всадник", wr1);
        Book bk2 = new Book("Мертвые души", wr2);
        Book bk3 = new Book("Ночь перед Рождеством", wr2);

        ArrayList wrs = new ArrayList();
        wrs.add(wr1);
        wrs.add(wr2);
        Book bk4 = new Book("Произведения 17-18 века",  wrs);

        lib.addNewBook(bk1);
        lib.addNewBook(bk2);
        lib.addNewBook(bk3);
        lib.addNewBook(bk4);
    }




}
