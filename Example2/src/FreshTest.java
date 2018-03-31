
public class FreshTest {
	public static void main (String[]args) {
		Fresh juice=new Fresh();
		juice.size=Fresh.Freshsize.medium;
		System.out.println("Size : " + juice.size);
				
		
	}
}
class  Fresh{
	 enum Freshsize{small,medium,large};
	 Freshsize size;
}
	 

