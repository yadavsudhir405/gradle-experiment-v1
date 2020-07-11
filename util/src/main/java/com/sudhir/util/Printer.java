package com.sudhir.util;

import com.sudhir.common.Person;

public class Printer {

  public static void print(Object obj){
    Person person = (Person)obj;
    System.out.println("name: "+person.getName());
  }
}
