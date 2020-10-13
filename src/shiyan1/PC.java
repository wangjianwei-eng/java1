package shiyan1;

public class PC {
	private CPU cpu;
	private HardDisk HD;

	void setCPU(CPU cpu) {
		this.cpu = cpu;

	}

	void setHardDisk(HardDisk HD) {
		this.HD = HD;

	}

	void show() {
		System.out.println("CPU速度:" + cpu.getSpeed());
		System.out.println("CPU品牌:" + cpu.getBand());
		System.out.println("硬盘容量:" + HD.getAmount());
		System.out.println("硬盘类型:" + HD.getType());
	}

}