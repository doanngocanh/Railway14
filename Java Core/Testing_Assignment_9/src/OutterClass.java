
public class OutterClass {
	public void show() {
		InnerClass innerClass = new InnerClass();
		innerClass.show();
	}
	
	public class InnerClass {
		public void show() {
			System.out.println("đây là inner class");
		}
	}

}
