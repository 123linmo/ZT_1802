package page001;

public class Bubble_sort {

	public static void main(String[] args) {
		int [] array= {9,8,3,5,2,};
		System.out.println("這個數組的長度是"+array.length);
		for (int szys:array) {
			System.out.print(szys+" ");
		}
		System.out.println();//换行
		/*冒泡排序第一趟：2 9835
		 * 冒泡排序第二趟：23 985
		 * 冒泡排序第三趟：235 98
		 * 冒泡排序第四趟：2358 9
		 */
		//定义外循环，表示趟数ss
		for(int m=1;m<array.length;m++) {
			//定义内循环
			for(int n=0;n<array.length-m;n++) {
				if(array[n]>array[n+1])
				{
					int temp=array[n];
					array[n]=array[n+1];
					array[n+1]=temp;
				}
				}
			
			}
		for (int szys:array) {
			System.out.print(szys+" ");
		}
		}
	}


