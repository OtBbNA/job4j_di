package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();

        StartUI ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
        ui.input("Select some of:");

        Store store = context.getBean(Store.class);
        store.add("1");

        Store another = context.getBean(Store.class);
        another.add("2");

        another.getAll().forEach(System.out::println);
    }
}