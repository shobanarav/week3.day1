package org.system;

public class Desktop extends Computer{
	
	public void desktopSize()
	{
		System.out.println("Size is 10x4x8");
	}
	
	public static void main(String[] args) {
		
		Desktop var = new Desktop();
		var.computerModel();
		var.desktopSize();
		
				
	}

}
