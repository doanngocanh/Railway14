
public class CPU {
	int price;

	public CPU(int price) {
		super();
		this.price = price;
	}

	public class Processor {
		int coreAmount;
		String menufacturer;

		public Processor(int coreAmount, String menufacturer) {
			super();
			this.coreAmount = coreAmount;
			this.menufacturer = menufacturer;
		}

		public double getCache() {
			return 4.3;

		}

	}

	public class Ram {
		int memory;
		String menufacturer;

		public Ram(int memory, String menufacturer) {
			super();
			this.memory = memory;
			this.menufacturer = menufacturer;
		}
		
		public double getClockSpeed() {
			return 5.5;
		}

	}

	public static void main(String[] args) {
		CPU cpu = new CPU(10);
	
		Processor processor = cpu.new Processor(20, "A");
		
		Ram ram = cpu.new Ram(30, "B");
		
		System.out.println(processor.getCache());
		System.out.println(ram.getClockSpeed());
	}
}
