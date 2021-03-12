class PolymorphismDemo1{
static void read(int a,int b){
	System.out.println(a+b);
}
static void read(int[] a,int[] b){
	for(int i=0;i<a.length;i++){
		for(int j=0;j<b.length;j++){
			int sum=0;
			sum=sum+a[i];
			System.out.println(a[i]);
			System.out.println(sum);
			System.out.println(b[j]);
		}
	}
}
void read(char[] g){
		for(int i=0;i<g.length;i++){
			System.out.println(g[i]);
		}
	}
	public static void main(String[] args){
		PolymorphismDemo1 ad=new PolymorphismDemo1();
		ad.read(12,31);
		int[] a={12,31,34,45,55,43};
		int[] b={13,44,54,53,66};
		ad.read(a,b);
		char[] g={'w','d','e','f'};
		ad.read(g);
	}
}