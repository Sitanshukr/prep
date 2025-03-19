package com.content.java.core.oops.polymorphism;

import javax.lang.model.element.NestingKind;

public class Animal {
	
	private String name;
	private String breed;
	private String eyeColor;
	private String food;

	public void setName(String name) {
		if (name.equals("Kitty")) {
			this.name = "CAT";
		}else if (name.equals("Jumbo")){
			this.name = "Elephant";
		}else{
			this.name=name;
		}
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public String getFood() {
		return food;
	}


	public String Owner(){
		return "girl";
	}


}
