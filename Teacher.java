package doctor;
interface Teac{      //Teacher�ӿ�
	void setBasic(String name, int number, String sex);
	void setTeacher(double wages,String course);
}
public class Teacher extends Doctor implements Teac{
	public void setBasic(String name,int number,String sex){
		this.name=name;
		this.number=number;               //�趨������Ϣ 
		this.sex=sex;
	}
	public void setTeacher(double wages,String course){
		this.wages=wages;                 //�趨нˮ �γ�
		this.course=course;
	}

}
