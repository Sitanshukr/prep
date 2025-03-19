package com.content.java.SerialDeserialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeUtil {

	public void serialize(Object object) throws Exception {
		FileOutputStream fileOutputStream = new FileOutputStream("serial.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(object);
		objectOutputStream.flush();
		objectOutputStream.close();
		
	}

	public void deserialize() throws Exception {
		List<Person> personList = new ArrayList<>();
		FileInputStream fileInputStream = new FileInputStream("serial.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Person person= (Person)objectInputStream.readObject();
		System.out.println("Person name :: " +person.getName());
		objectInputStream.close();

	}
}
