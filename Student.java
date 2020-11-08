package doctor;
interface Stu{      	//Student接口
	void setStudent(double cost,String major);
}
public class Student extends Doctor implements Stu{

	Student(){}
	
	public void setStudent(double cost,String major){
		this.cost=cost;
		this.major=major;           //设定学费 专业
	}
}
