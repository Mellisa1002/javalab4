package doctor;

interface Doc extends Stu,Teac{
	void setIsCost(boolean a);
	void setIsWages(boolean b);
	double counTax(double basic,double wages);

} 										//Doctor�ӿ�,�趨�Ƿ�ɷ�

public class Doctor implements Doc{
	
	public String name;      		    //����
	public int number;					//���
	public String sex;					//�Ա�
	public double cost;					//ѧ��
	public boolean isCost = false;		//�Ƿ����ѧ��
	public String major;				//ѧ��רҵ
	public double wages;				//����
	public boolean isWages = false;		//�Ƿ񷢷Ź���
	public String course;				//��ʦ�����ڿγ�
	public double tax1(double wages,double cost) {
		return (wages-cost); 			//������˰����
	}
	
	public void setBasic(String name,int number,String sex){
		this.name=name;
		this.number=number;              //�趨������Ϣ 
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
		//Ӧ�ɵ�����˰=Ӧ��˰���ö�*����˰��   ȥ���˸��ӵ�˰�ʼ���,ɸѡ�˼򵥵�һ����,�ٶ����в�ʿ��������3w(ȷʵ���뿴��˰�ʹ�ʽ��)
		final double[] taxs= {0.03,0.1,0.2,0.25,0.3,0.35,0.45};   //����һ���㶨static˰������
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
