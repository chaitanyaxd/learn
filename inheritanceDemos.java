class Parent{
void m1(){
	int x=10,y=20;
	int z=x+y;
	System.out.println(z);
}
}
class Child extends Parent{
	void m2(){
		int[] a={12,34,24,23,15,35};
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
class Teen extends Child{
	void m3(){
		String sr=new String("chaitanya");
		System.out.println(sr);
	}
}
class Kids{
	public static void main(String[] args){
		Teen tn=new Teen();
		tn.m1();
		tn.m2();
		tn.m3();
	}
}
