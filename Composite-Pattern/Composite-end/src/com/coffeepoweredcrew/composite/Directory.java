package com.coffeepoweredcrew.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Composite in the composite pattern
public class Directory extends File{

	private List<File> childrens = new ArrayList<>();
	
	
	public Directory(String name) {
		super(name);
	}
	

	@Override
	public void ls() {
		System.out.println(getName());

		childrens.forEach(File :: ls);
	}

	@Override
	public void addFile(File file) {
		childrens.add(file);		
	}

	@Override
	public File[] getFiles() {
		return childrens.toArray(new File[childrens.size()]);
	}

	@Override
	public boolean removeFile(File file) {
		return childrens.remove(file);
	}
	
	
}
