package project.code02;

import project.code02.supermarket.*;

import java.util.Scanner;

public class MainControlV2 {

    public static void main(String[] args) {
        for (Category category : Category.values()) {
            System.out.println("-----------" + category.getId() + "------------");
//            System.out.println(category.ordinal());
            System.out.println(category.name());
            System.out.println(category.toString());
        }
    }
}