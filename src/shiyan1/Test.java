package shiyan1;

public class Test {
	public static void main(String args[]) {
		CPU cpu = new CPU(2200, "Intel");

		HardDisk HD = new HardDisk(200,"HDD");
//	       cpu.setSpeed(2200);
//	       HD.setAmount(200);
		PC pc = new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(HD);
		pc.show();
	}

}