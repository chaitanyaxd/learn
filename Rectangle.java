class Rectangle{
int l=3,b=4;
Rectangle(){
	l=3;b=4;
}
Rectangle(int x){
	l=b=x;
}
Rectangle(int x,int y){
	l=x;
	b=y;
}
void area(){
	System.out.println(l*b);
}
public static void main(String[] args){
	Rectangle ar=new Rectangle();
	ar.area();
	Rectangle ar1=new Rectangle(3);
	ar1.area();
	Rectangle ar2=new Rectangle(5,6);
	ar2.area();
}
}