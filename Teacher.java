package doctor;
interface Teac{      //Teacher接口
	void setBasic(String name, int number, String sex);
	void setTeacher(double wages,String course);
}
public class Teacher extends Doctor implements Teac{
	public void setBasic(String name,int number,String sex){
		this.name=name;
		this.number=number;               //设定基本信息 
		this.sex=sex;
	}
	public void setTeacher(double wages,String course){
		this.wages=wages;                 //设定薪水 课程
		this.course=course;
	}

}
