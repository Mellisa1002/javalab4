package doctor;
interface Stu{      	//Student�ӿ�
	void setStudent(double cost,String major);
}
public class Student extends Doctor implements Stu{

	Student(){}
	
	public void setStudent(double cost,String major){
		this.cost=cost;
		this.major=major;           //�趨ѧ�� רҵ
	}
}
