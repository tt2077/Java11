abstract class CShape
{
	protected String color;
	public CShape(String str) {
		color=str;
	}
	
	public abstract void show();
}
class CRectangle extends CShape
{
	int width,height;
	public CRectangle(int w,int h)
	{
		super("Yellow");
		width=w;
		height=h;
	}
	public void show()
	{
		System.out.println("color="+color+", ");
		System.out.println("area="+width*height);
	}
}

class CCircle extends CShape
{
	double radius;
	public CCircle(double r)
	{
		super("Green");
		radius=r;
	}
	public void show()
	{
		System.out.println("color="+color+", ");
		System.out.println("area="+3.14*radius*radius);
	}
}
public class Class01 {

	public static void main(String[] args) {
		CRectangle rect1=new CRectangle(5, 10);
		rect1.show();
		CCircle cir1=new CCircle(2.0);
		cir1.show();
	}

}
