package Base;

public class MyInteger {
	private int iValue;
	
	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}
	
	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}

	public boolean isEven(){
		if ((getiValue() % 2) == 0)
			return true;
		else
			return false;
	}
	public boolean isOdd(){
		if ((getiValue() % 2) == 1)
			return true;
		else
			return false;
	}
	public boolean isPrime(){
	    for(int i = 2; i < getiValue(); i++) {
	        if((getiValue() % i) == 0)
	            return false;
	    }
	    return true;
	}
	public static boolean isEven(int n){
		if ((n % 2) == 0)
			return true;
		else
			return false;
	}
	public static boolean isOdd(int n){
		if ((n % 2) == 1)
			return true;
		else
			return false;
	}
	public static boolean isPrime(int n){
	    for(int i = 2; i < n; i++) {
	        if((n % i) == 0)
	            return false;
	    }
	    return true;
	}
	public static boolean isEven(MyInteger z){
		if ((z.getiValue() % 2) == 0)
			return true;
		else
			return false;
	}
	public static boolean isOdd(MyInteger z){
		if ((z.getiValue() % 2) == 1)
			return true;
		else
			return false;
	}
	public static boolean isPrime(MyInteger z){
	    for(int i = 2; i < z.getiValue(); i++) {
	        if((z.getiValue() % i) == 0)
	            return false;
	    }
	    return true;
	}
	public boolean equals(int n){
		if (n == iValue)
			return true;
		else
			return false;
	}
	public boolean equals(MyInteger z){
		if (z.iValue == iValue)
			return true;
		else
			return false;
	}
}
