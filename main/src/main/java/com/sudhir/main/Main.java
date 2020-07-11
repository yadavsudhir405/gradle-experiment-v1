package com.sudhir.main;

import com.sudhir.common.Person;
import com.sudhir.util.Printer;

public class Main {
public static void main(String[] args) {
        Person person = new Person("Foo", 28);
        Printer.print(person);
      }
}
