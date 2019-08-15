package session9;

import java.util.HashMap;
import java.util.Iterator;

public class HMapEmp {

	public static void main(String[] args) {
		Integer[] empCode= {1,2,3,4,5,6,7,8,9,10};
		String [] empName= {"Alex","Sam","John","Bill","Daniel","Peter","River","August","Dean","Trent"};
		HashMap<Integer,String> emp=new HashMap<Integer ,String>();
		for(int i=0;i<empCode.length;i++) {
			emp.put(empCode[i],empName[i]);
		}
		for (String string : empName) {
			System.out.println(string);
		}
	}

}
