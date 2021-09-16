

public class MainClass {
	public static void main(String[] args) {
		OutterClass outterClass = new OutterClass();
		outterClass.show();

		OutterClass.InnerClass innerClass = outterClass.new InnerClass();
		innerClass.show();

	}
}
