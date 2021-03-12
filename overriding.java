class Parent{
void msg(){
	System.out.println("good morning");
}
}
class Child extends Parent{
	void msg(){
		System.out.println("good evening");
	}
}
class Overriding{
	public static void main(String[] args){
		Parent p=new Parent();
		p.msg();
		
		Child c=new Child();
		c.msg();
		Parent p1=new Child();
		p1.msg();
	}
}