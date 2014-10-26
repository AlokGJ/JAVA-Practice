
class Box {
	private double width;
	double height;
	double length;
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	public void show()
	{
		System.out.println("Show() from BOX");
	}
}

class Sox extends Box{
	
	public void show()
	{
		System.out.println("Show() from SOX");
	}
}

class Xox extends Sox{
	public void show()
	{
		System.out.println("Show() from XOX");
	}
}
