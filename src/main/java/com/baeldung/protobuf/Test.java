package com.baeldung.protobuf;

import java.util.Random;

public class Test {
  public static void main(String[] args) {
    System.out.println("Hello World");
    String email = "j@baeldung.com";
    	int id = new Random().nextInt();
	String name = "Michael Program";
	String number = "01234567890";
	Person person = AddressBookProtos.Person.newBuilder().setId(id).setName(name).setEmail(email).addNumbers(number).build();

 System.out.println("Hello World person = "+person);
  }
}
