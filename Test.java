package doctor;
import java.util.Random;
//import java.util.Scanner;   ��ȥ��Scanner������ Scanner���Ѱ�
public class Test{
	static boolean a = new Random().nextBoolean();    //���������ģ���Ƿ�нˮ
	
	public static String toString(Doctor doc) {
		return "��ǰ��¼ϵͳ�û�Ϊ:"+" \n����: "+doc.name+" ���: "+doc.number+" �Ա�: "+doc.sex+" רҵ: "+doc.major+"  ���̿γ�:"+doc.course+" ����: "+doc.wages+" ѧ��: "+doc.cost+"  �Ƿ��ѽ�ѧ��:"+doc.isWages+"  �Ƿ��ѷ�����:"+doc.isCost;
	}
	
	public static void Check(Doctor doc) throws TaxError{
		if (doc.isWages==true) {
			System.out.println("  ����˰��Ϊ:"+doc.counTax(doc.tax1(doc.wages,doc.cost),doc.wages));
		}
		else{throw new TaxError();}
	}
		
	public static void main(String args[]) {
		
		
		Doctor doc1 = new Doctor();
		Doctor doc2 = new Doctor();
		doc1.setBasic("�³�",2019300,"Ů");      //���Ը�Ϊ�������� �����(����¼����Ϣ)��
		doc1.setStudent(8000,"������");
		doc1.setTeacher(40000,"Python�������");
		doc2.setBasic("ԬȪ",2019311,"��");      //���Ը�Ϊ�������� �����(����¼����Ϣ)��
		doc2.setStudent(10000,"�������ѧ�뼼��");
		doc2.setTeacher(48000,"C���Գ������");
		 
		doc1.setIsCost(a);	
		doc2.setIsCost(a);
		doc1.setIsWages(a);
		doc2.setIsWages(a);
		
		//�쳣����Ϊ �Ƿ�нˮ(û��нˮ����˰)
		
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

