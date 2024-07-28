package com.content.java.SerialDeserialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeUtil {

	
	public void serialize(Object object) throws Exception {
		
		FileOutputStream fileOutputStream = new FileOutputStream("person.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(object);
		objectOutputStream.flush();
		objectOutputStream.close();
		
	}
}
