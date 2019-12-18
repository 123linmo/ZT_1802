package page001;

public class E06 {

	public static void main(String[] args) {
		int x=0;//定义变量x，初始值为0
		int y=0;//定义变量y，初始值为0
		int z=0;//定义变量z，初始值为0
		boolean a,b;//定义boolean变量a与b
		a=x>0 & y++>1;//逻辑运算符&对表达式进行运算，然后将结果赋值给a
		System.out.print("a="+a);
		System.out.print("y="+y);
		b=x>0&& z++>1;//逻辑运算符&&对表达式进行运算，然后将结果赋值b
		System.out.print("b="+b);
		System.out.print("z="+z);
		
		//条件运算符？：
		int store=103;
		System.out.println(store<=0?"库存没有了":store<100?"库存为"+store:"库存太多");
	
		
	
		{
			
		}
	}

}
