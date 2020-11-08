package doctor;

interface Doc extends Stu,Teac{
	void setIsCost(boolean a);
	void setIsWages(boolean b);
	double counTax(double basic,double wages);

} 										//Doctor接口,设定是否缴费

public class Doctor implements Doc{
	
	public String name;      		    //名字
	public int number;					//编号
	public String sex;					//性别
	public double cost;					//学费
	public boolean isCost = false;		//是否缴纳学费
	public String major;				//学生专业
	public double wages;				//工资
	public boolean isWages = false;		//是否发放工资
	public String course;				//老师所教授课程
	public double tax1(double wages,double cost) {
		return (wages-cost); 			//返回纳税基础
	}
	
	public void setBasic(String name,int number,String sex){
		this.name=name;
		this.number=number;              //设定基本信息 
		this.sex=sex;
	}
	public void setTeacher(double wages,String course){
		this.wages=wages;
		this.course=course;
	}

	public void setStudent(double cost,String major){
		this.cost=cost;
		this.major=major;
	}
	public void setIsCost(boolean a) {
		this.isCost = a;
	}
	public void setIsWages(boolean b) {
		this.isWages = b;
	}
	public double counTax(double basic,double wages) {
		//应纳的所得税=应纳税所得额*适用税率   去除了复杂的税率计算,筛选了简单的一部分,假定所有博士生工资上3w(确实不想看这税率公式了)
		final double[] taxs= {0.03,0.1,0.2,0.25,0.3,0.35,0.45};   //定义一个恒定static税率数组
		if (wages<=10000 && wages>=0)
		{return basic*taxs[0];}
		else if (wages<=20000 && wages>10000)
		{return basic*taxs[1];}
		else if (wages<=30000 && wages>20000)
		{return basic*taxs[2];}
		else if (wages<=40000 && wages>30000)
		{return basic*taxs[3];}
		else if (wages<=50000 && wages>40000)
		{return basic*taxs[4];}
		else if (wages<=60000 && wages>50000)
		{return basic*taxs[5];}
		else  
		{return basic*taxs[6];}
	}



}
