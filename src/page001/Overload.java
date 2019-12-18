package page001;

public class Overload {
	//1.实现两个整数相加
	public static int add (int x ,int y){
	return x+y;
	}
	//2.实现三个整数相加
	public static int add(int x,int y,int z) {
		return x+y+z;
		
	}
	//2.实现三个小数相加
		public static double add(double x,double y) {
			return x+y;
		}
			
	
	

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//针对求和方法的调用
		//在静态
		int sum1=add(1, 2);
		int sum2=add(3, 4,7);
		double sum3=add(0.2,5.3 );
		//打印求和的结果
		System.out.println("sum1"+sum1);
		System.out.println("sum2"+sum2);
		System.out.println("sum3"+sum3);


	}

}
