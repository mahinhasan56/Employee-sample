
public class Puppy {
	int puppyAge;

public Puppy(String name){
	System.out.print("name choosen " + name);
}

	public void setAge(int age) {
		puppyAge = age;
	}

	public int getAge() {
		System.out.print(", Puppy is : " + puppyAge);
		return puppyAge;
	}

	public static void main(String[] args) {
		Puppy mypuppy = new Puppy("tommy");
		mypuppy.setAge(2);
		mypuppy.getAge();
		System.out.print(", variable value : " + mypuppy.puppyAge);

	}
}