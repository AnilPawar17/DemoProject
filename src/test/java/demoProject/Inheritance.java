package demoProject;
class  a
{
	void display()
	{
	System.out.println("calss a displayed");
}
}

class b extends a
{
	void display()
	{
	System.out.println("calss b displayed");
}
}

class c extends a
{
	void display()
	{
	System.out.println("calss b displayed");
}
}



public class Inheritance {
	public static void main(String[] args) 
	{
		b ref=new b();
		ref.display();
		
	}

}
