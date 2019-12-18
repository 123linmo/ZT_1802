package page001;

public class Break {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int x=1;//定义变量想，初始值为1
		while(x<=4) {//判断循环条件是否成立
			System.out.println("x="+x);//条件成立，打印x的值
			if(x==3) {
				break;
			}
		}

	}

}
