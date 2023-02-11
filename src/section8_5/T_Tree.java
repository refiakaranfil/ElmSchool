package section8_5;

public abstract class T_Tree {
	
	String name;
	int height;

	public T_Tree(String name, int height) {
	this.name = name;
	this.height = height;
	}

	abstract void grow();

	public String toString() {

	return name + " " + height;
	}

}
