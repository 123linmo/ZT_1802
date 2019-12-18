package page001;

public class CONDITION {

	public static void main(String[] args) {
		int age = 11;
		if (age < 10)
			System.out.print("此人是儿童");
		else if (age < 18)
			System.out.print("此人是未成年");
	//假設
		int month=5;//假设当前月份为五月
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.print("当前时间为冬季");
			break;
			
			
		case 3:
		case 4:
		case 5:
			System.out.println("当前时间为春季");
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.print("当前时间为夏季");
			break;
					
		case 9:
		case 10:
		case 11:
			System.out.print("当前时间为秋季");
			break;
			default:
				System.out.println("输入的月份不正确!!!");
				break;
					
						
			
			
		
		
		}
		
	}
	

}
