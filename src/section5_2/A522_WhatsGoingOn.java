package section5_2;

public class A522_WhatsGoingOn {
	
	public static int[] make(int n) {
	    int[] a = new int[n];
	    for (int i = 0; i < n; i++) {
	        a[i] = i + 1;   // {1, 2, 3, 4, 5}
	    }    
	    return a;
	}

	public static void dub(int[] jub) {
	    for (int i = 0; i < jub.length; i++) {
	        jub[i] *= 2; // {2, 4, 6, 8, 10}
	    }
	}

	public static int mus(int[] zoo) {
	    int fus = 0;
	    for (int i = 0; i < zoo.length; i++) {
	        fus += zoo[i]; // 2 + 4 + 6 + 8 + 10 = 30
	    }
	    return fus;
	}

	public static void main(String[] args) {
	    int[] bob = make(5);
	    dub(bob);
	    System.out.println(mus(bob));
	}

}
