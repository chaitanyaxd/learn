class Demo{
void show(int x){
	System.out.println("int value");
}
}
class Test extends Demo{
	void show(char x){
		System.out.println("char vlue");
	}
}
class Read extends Test{
	void add(int[] b){
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
}
class Demos{
public static void main(String[] args){
	Read td=new Read();
	td.show(1);
	td.show('a');
	int[] b={12,32,31,34,54};
	td.add(b);


}
}