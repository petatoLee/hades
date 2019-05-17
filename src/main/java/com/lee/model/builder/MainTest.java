package com.lee.model.builder;

public class MainTest {
	public static void main(String[] args) {
		ComputerBuilder computerBuilder = new ComputerBuilder();
		Computer create = computerBuilder.buildCpu("intel").buildKeyboard("haier").buildMemory("8G").buildMourse("test")
				.buildViewer("AOC").create();
		System.out.println(create.getCpu());
	}

}
