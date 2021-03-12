class PolymorphismDemos{
static void read(int a,int b){
	System.out.println(a+b);
}
static void read(int a,int b,int c){
	System.out.println(a+b+c);
}
void read(double a,double b){
	System.out.println(a*b);
}
void read(int a){
	for(int i=1;i<=10;i++){
		System.out.println(a+"*"+i+"="+(a*i));
	}
}
void read(int[] a){
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
}
static void read(String s){
	System.out.println(s);
}
public static void main(String[]ar){
	PolymorphismDemos td = new PolymorphismDemos();
	td.read(3,4);
	td.read(3,4,5);
	td.read(2.4,5.4);
	td.read(5);
	int[] a={12,33,44,23,45,55};
	td.read(a);
	String s=new String("chaitanya");
	td.read(s);
}
}
	