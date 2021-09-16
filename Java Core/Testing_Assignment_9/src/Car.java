
public class Car {
	String name;
	String type;

	public Car(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	public class Engine {
		String engineType;
		public Engine(String engineType) {
			this.engineType = engineType;
			
		
		}
		public String getEngineType() {
			return engineType;
		}
		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}
		
	}
	public static void main(String[] args) {
		Car mazda = new Car("Mazda", "8WD");
		Engine engine = mazda.new Engine("Crysler");
		
		System.out.println(engine.getEngineType());
	}
	
	

}
