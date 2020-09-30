class join {
	public static void main(String[] args) {
		int iVal = 100;
//		String strVal = String.valueOf(iVal);
		String strVal = iVal + "";
		
		double dVal = 200.0;
		String strVal2 = dVal + "";

		double sum  = Integer.parseInt("+"+strVal)
                                          + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
		//+를 사용하면 성능이 떨어질 수 있기 때문에 String.join을 쓰는 것을 권장. 
		System.out.println(strVal+"+"+strVal2+"="+sum2);
	}
}