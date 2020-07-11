package com.sudhir.util;

import com.sudhir.common.Person;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Printer {

  public static void print(Object obj){
    Person person = (Person)obj;
    try {
      ObjectMapper objectMapper = new ObjectMapper();
      String json = objectMapper.writeValueAsString(person);
      System.out.println(json);
    }catch(Exception e){
    }
  }
}
