# java1
# Java练习1
* 对应教材 P110 4.编程题

## 实验内容
* 用类描述计算机中CPU的速度和硬盘的容量。Java应用程序一共有4个类，类的名字分别是PC、CPU、HardDisk和Test，其中Test是主类。

### CPU类
* getSpeed()返回speed的值
* setSpeed(int m)方法将参数m的值赋值给speed；

### HardDisk类
* getAmount()返回amount的值
* setAmount(int m)方法将参数m的值赋值给amount；

### PC类
* setCPU(CPU c)将参数c的值赋值给cpu
* setHardDisk(HardDisk h)方法将参数h的值赋值给HD
* show()方法能显示cpu的速度和硬盘的容量。

### 主类Test
* main方法中创建一个CPU对象cpu，pc将speed设置为2200
* main方法中创建一个 HardDisk对象disk，disk将amount设置为200
* main方法中创建一个PC对象pc
* pc调用setCPU(CPU c)方法，调用时实参是cpu
* pc调用setHardDisk(HardDisk h)方法，调用时实参是disk
* pc调用show()方法。

## 实验设计
* 定义CPU、HardDisk、PC和Test类，并将最终主方法放在Test类中
* 为每一个类添加两个构造方法，一个是空构造方法，一个是将参数赋值的构造方法。
```java
Cpu.java
public CPU() {
	}
	public CPU(int speed, String band) {
		this.speed = speed;
		this.band = band;
	}
public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
```
```java
harddisk.java
public HardDisk() {
	}
	public HardDisk(int amount,String type) {
		this.amount = amount;
		this.type =type;
	}
public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
```
## 实验结果
CPU速度:2200
CPU品牌:Intel
硬盘容量:200
硬盘类型:HDD
##实验感想
第一次做java程序设计出了很多错误，不过最后都解决了，明白了类的定义和约束关键字的范围以及具体的表现形式
