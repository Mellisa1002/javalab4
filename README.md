# 陈立男 2019311232 计192 

## java第四次上机实验:接口及异常处理

<br>

### 实验目的  

<br>

    1.掌握Java中抽象类和抽象方法的定义
    2.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
    3.了解异常的使用方法，并在程序中根据输入情况做异常处理

<br>


### 实验设计

<br>


    1.按照题目要求，先完成基本的对pc机的模拟，含有CPU、HardDisk、PC三个类，以及最后一个Test类。
    2.在基本完成的基础上，加入CPU的新属性品牌，并加入对CPU品牌和速度的逻辑判断；加入HD的新属性类型，同时有对HD的存储容量和类型的逻辑判断。
    
    
<br>
    
### 核心方法

*CPU类*



```
package lab1;

public class CPU {
	private int speed;        //速度
	public String brand;      //品牌
	CPU(){}                           //构造方法1
	CPU(int speed , String brand){    //构造方法2
		this.speed = speed;
		this.brand = brand;		
	}
	void setSpeed(int m) {//设置cpu速度
			speed = m ;	
	}
	int getSpeed() {             //获取cpu速度
		if(speed<=0) {
			System.out.println("cpu的速度有误." );
			return speed;
		}
		else {	
		System.out.println("CPU的速度为:" + speed);
		return speed;
		}
	}
	String setBrand(String b) {  //判断cpu品牌是否正确
		this.brand = b ;	
		String intel=new String("Intel");
		String cnintel=new String("英特尔");
	    String amd=new String("AMD");
		if (brand.equals(intel))
		{
			return brand;
		}
		else if(brand.equals(cnintel))
		{
			return brand;	  
		}
		else if(brand.equals(amd))
		{
			return brand;
		}
		else 
		{
			brand="这个不是CPU品牌哦!";
			return brand;
		}			
		
	}

}

``` 

*HardDisk类*

```
package lab1;

public class HardDisk {
	private int amount;          //硬盘容量
	public String hdType;       //硬盘类型
	HardDisk(){}                           //构造方法1
	HardDisk(int amount,String hdType){    //构造方法2
		this.amount=amount;
		this.hdType=hdType;
	}
	void setAmount(int m){       //设定硬盘容量
		amount = m;
	}
	int getAmound() {            //获取硬盘容量
		return amount;
	}
	String setHDType(String t) { //设置并判断硬盘品牌是否正确
		this.hdType = t ;	
		String SATA=new String("SATA");
		String SCSI=new String("SCSI");
	    String SAS=new String("SAS");
		if (hdType.equals(SATA))
		{
			return hdType;
		}
		else if(hdType.equals(SCSI))
		{
			return hdType;	  
		}
		else if(hdType.equals(SAS))
		{
			return hdType;
		}
		else 
		{
			hdType="这个不是一个正确的硬盘类型!";
			return hdType;
		}	
		}
	}
```

*PC类*

```
package lab1;

public class PC {
	private CPU cpu;                    //cpu属性
	private HardDisk HD;                //HD属性
	
	PC(){}                      //构造方法1
	PC(CPU cpu,HardDisk HD){    //构造方法2
		this.cpu = cpu;
		this.HD = HD;
	}
	void setCPU(CPU c){      
		cpu = c ;
		}
	void setHardDisk(HardDisk h) {
		HD = h ;
		}
	
	void show() {              //屏幕输出
		cpu.getSpeed();
		System.out.println("CPU的品牌为:" + cpu.setBrand(cpu.brand));
		System.out.println("硬盘的容量为:" + HD.getAmound());
		System.out.println("硬盘的类型为:" + HD.setHDType(HD.hdType));
	}

}

```

*Test类*

```
package lab1;

public class Test {
	public static void main(String args[]) {
		CPU cpu=new CPU(2000,"Intel");                     //直接定义CPU HD PC
		HardDisk disk=new HardDisk(512,"SATA");            
		PC pc=new PC();
	
	    cpu.setSpeed(8200); 
	    cpu.setBrand("aMD"); 
	    disk.setAmount(256);
	    
	    pc.setCPU(cpu);
	    pc.setHardDisk(disk);
	    pc.show();
	    
	    cpu.setSpeed(-2200); 
	    cpu.setBrand("Intel"); 
	    disk.setAmount(512);
	    disk.setHDType("disk");
	    
	    pc.setCPU(cpu);
	    pc.setHardDisk(disk);
	    pc.show();
		
	}

}

```

### 实验结果
----
![](https://github.com/Mellisa1002/javalab1/blob/main/%E5%AE%9E%E9%AA%8C%E7%BB%93%E6%9E%9C.png)

<br>

### 实验感想

<br>

第一次正式上机实验中，发现课堂上虽然听明白了很多东西，但是实际上手实验时会发现还是不能很熟悉，毕竟第一次正式接触写一个完整的java程序有一定的难度。<br>
但是在看清楚并分析透彻题目要求后，有了一个大致的思路以后，可以先试着书写一个大致的框架。比如在这个实验中，可以确定需要有CPU、HardDisk两个最基本的类，然后用这两个类作为PC类的属性，最后再有单独一个类来测试程序是否正确。<br>
确定了大致的框架之后，就可以逐渐丰满完整整个程序了。<br>

在实际操作中，对于构造方法有了更深的理解。个人把他当做类似于c语言中最开始定义一个变量时，前面的一个类型的名字。<br>
比如` CPU(){} `构造方法，有点类似于c语言中定义一个变量中前边的变量类型（比如 ` int a; `中的 int ），因为有了这个构造方法，所以Test类中可以直接定义 ` CPU cpu = new CPU(); `而不用同时赋值。<br>
而构造方法` CPU(一些参数){一些赋值语句} `则像` int a = 2; `中，在定义变量的时候能够同时赋值。<br>
之前一直对类、方法、对象、属性之类的名词整不明白，但是在实验的时候边试验边查资料写，最后完全理解了。<br>
比如，类就很像之前c里边的结构体，但是结构体像是只是把很多基本类型组合在一起，变成一个新的打的复杂的类型；但是类不光是含有放在里边的基本类型，他还放了很多方法，这些方法就有的就是原来的函数一样的功能，有的就是让类成为新的类型，能够被其他类或者方法调用。对象就有点像之前说的变量（其实也不是），java程序就是对*对象*的处理的语言，属性就是对象里边有的已经定义的那些变量（?）,也就是对象的属性。<br>

还有private、public这样的修饰词放在属性前边就很好玩，第一次接触这样的。而且java中要求构造方法没有类型，其他方法要求必须有类型。而我在写对cpu速度的逻辑判断的时候，忘记了返回类型这件事，总想着怎样做到同一个变量名，能否强制转换类型，但是实际上换成直接输出问题就会解决的相当简单（不过回头有时间可以尝试想下怎么做到一个方法返回两种不同类型的值，网上好像有，当时没时间细看就略过了）。<br>
没做跨包调用的那一项，周末有时间的话补一下，还是先赶紧交上作业比较好...<br>
