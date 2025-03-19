package com.content.java.SerialDeserialize;

public class SerializeDeserializeTest {

	public static void main(String[] args) throws Exception {

		Person p1 = new Person(11, "Simon", "42345");
		Person p2 = new Person(45, "Alex", "64543");
		Person p3 = new Person(65, "Noah", "89756");
		Person p4 = new Person(65, "Vader", "12347");
		
		SerializeUtil util = new SerializeUtil();
		util.serialize(p1);
		util.serialize(p2);
		util.serialize(p3);
		util.serialize(p4);

		util.deserialize();
	}

}
