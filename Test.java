package doctor;
import java.util.Random;
//import java.util.Scanner;   先去掉Scanner部分了 Scanner真难啊
public class Test{
	static boolean a = new Random().nextBoolean();    //随机布尔型模拟是否发薪水
	
	public static String toString(Doctor doc) {
		return "当前登录系统用户为:"+" \n姓名: "+doc.name+" 编号: "+doc.number+" 性别: "+doc.sex+" 专业: "+doc.major+"  所教课程:"+doc.course+" 工资: "+doc.wages+" 学费: "+doc.cost+"  是否已交学费:"+doc.isWages+"  是否已发工资:"+doc.isCost;
	}
	
	public static void Check(Doctor doc) throws TaxError{
		if (doc.isWages==true) {
			System.out.println("  所纳税额为:"+doc.counTax(doc.tax1(doc.wages,doc.cost),doc.wages));
		}
		else{throw new TaxError();}
	}
		
	public static void main(String args[]) {
		
		
		Doctor doc1 = new Doctor();
		Doctor doc2 = new Doctor();
		doc1.setBasic("陈成",2019300,"女");      //可以改为交互输入 输入后(等于录入信息)再
		doc1.setStudent(8000,"物联网");
		doc1.setTeacher(40000,"Python程序设计");
		doc2.setBasic("袁泉",2019311,"男");      //可以改为交互输入 输入后(等于录入信息)再
		doc2.setStudent(10000,"计算机科学与技术");
		doc2.setTeacher(48000,"C语言程序设计");
		 
		doc1.setIsCost(a);	
		doc2.setIsCost(a);
		doc1.setIsWages(a);
		doc2.setIsWages(a);
		
		//异常可以为 是否发薪水(没发薪水不交税)
		
		try{
			System.out.println(toString(doc1));
			Check(doc1);
		}
		catch(TaxError error){
			System.out.println(error.getError());
		}
		try{
			System.out.println(toString(doc2));
			Check(doc2);
		}
		catch(TaxError error){
			System.out.println(error.getError());
		}
		
		
		
	}
}	

