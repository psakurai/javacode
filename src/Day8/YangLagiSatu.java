package Day8;

class YangLagiSatu {
	public int d;
	public String n;
	protected int val;

	YangLagiSatu() {
		this.d = 123;
		n = "Admin";
		val = 69;
	}

	YangLagiSatu(int d, String name) {
		this.d = d;
		n = name;
		val = 69;
	}

	public String toString() {
		return String.format("%d:%s:%d", d, n, val);
	}

	public int getID() {
		return d;
	}

	public void setID(int d) {
		this.d = d;
	}

	private String getName() {
		return n;
	}

	public int getVal() {
		return val;
	}

	static void display() {
		YangLagiSatu testStatic = new YangLagiSatu();
		System.out.println("Student ID : " + testStatic.d + "\nName : " + testStatic.n);
	}

	void displayNonStatic() {
		System.out.println("Student ID : " + d + "\nName : " + n);
		System.out.println(getID());
		System.out.println(getName());
		System.out.println(getVal());
	}
}
