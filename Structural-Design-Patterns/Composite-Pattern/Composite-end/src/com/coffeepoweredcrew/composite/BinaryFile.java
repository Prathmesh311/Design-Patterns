package com.coffeepoweredcrew.composite;

//Leaf node in composite pattern
public class BinaryFile extends File{
	
	
	private int size;
	
	public BinaryFile(String name, int size) {
		super(name);
		this.size = size;
	}
	

	@Override
	public void ls() {
		System.out.println(getName() + " " + size);
	}
	
	
	//Extra method only usefull for directory management
	@Override
	public void addFile(File file) {
		throw new UnsupportedOperationException("Leaf node does't support add file operation");
	}

	@Override
	public File[] getFiles() {
		throw new UnsupportedOperationException("Leaf node does't support get file operation");
	}

	@Override
	public boolean removeFile(File file) {
		throw new UnsupportedOperationException("Leaf node does't support remove file operation");
	}
	
	
}
