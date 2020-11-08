package doctor;

public class TaxError extends Exception{     //自定义的异常
	String m = "还未发工资暂不需要缴税!";
	String getError(){
		return m;
	}
	
}

