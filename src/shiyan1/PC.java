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
		System.out.println("CPU�ٶ�:" + cpu.getSpeed());
		System.out.println("CPUƷ��:" + cpu.getBand());
		System.out.println("Ӳ������:" + HD.getAmount());
		System.out.println("Ӳ������:" + HD.getType());
	}

}