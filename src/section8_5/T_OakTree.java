package section8_5;

public class T_OakTree  extends T_Tree{
	
	String nut;

	public T_OakTree(String name, int height, String nut) {
	super(name, height);
	this.nut = nut;
	}

	void grow() {

	System.out.println("Oak tree grows 3 feet every year...");
	}


}
