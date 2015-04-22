public class Test0422{
	public static void main(String[] args){
		System.out.println("20150422開發流程練習");
		int x=10, y=5;
		new A().minFunc(x, y);
		new B().maxFunc(x, y);
		new C().avgFunc(x, y);
	}
}
Class B{
	public void maxFunc(int x,int y){
		int min=0;
		int max=0;
		if(x>y){
			max=x;
			min=y;
		}
		else{
			max=y;
			min=x;
		}
		System.out.printf(max);
	}
}
		