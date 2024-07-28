package com.content.java.SerialDeserialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializeUtil {

	
public Object deserialize() throws Exception {
		
		FileInputStream fileIutputStream = new FileInputStream("/person.txt");
		ObjectInputStream objectIutputStream = new ObjectInputStream(fileIutputStream);
		Object obj = (Object) objectIutputStream.readObject();
		return obj;
		//objectIutputStream.close();
		
	}
}
