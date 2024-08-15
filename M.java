package pack1;

public class M {
	public static void main(String[] args) {
		n n1=new n(20);
	}}

class m{
	int i ;
	public m(int i) {
		 this.i = ++i;
	}
}
class n extends m{
	public n(int i) {
		super(i--);
		System.out.println(this.i);
		System.out.println(super.i);
		System.out.println(i);
		
	}}