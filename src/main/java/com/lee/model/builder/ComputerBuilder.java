package com.lee.model.builder;

public class ComputerBuilder implements Builder {
	Computer computer = new Computer();

	public ComputerBuilder buildCpu(String cpu) {
		this.computer.setCpu(cpu);
		return this;
	}
	
	public ComputerBuilder buildMemory(String memory) {
		this.computer.setMemory(memory);
		return this;
	}
	
	
	public ComputerBuilder buildMourse(String mourse) {
		this.computer.setMourse(mourse);
		return this;
	}
	
	
	public ComputerBuilder buildKeyboard(String keyboard) {
		this.computer.setKeyboard(keyboard);
		return this;
	}
	
	public ComputerBuilder buildViewer(String viewer) {
		this.computer.setViewer(viewer);
		return this;
	}
	
	
	

	@Override
	public Computer create() {
		return computer;
	}

}
