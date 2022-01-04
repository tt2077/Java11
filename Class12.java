interface Data
{
	public void best();
	public void failed();
}
interface Test extends Data
{
	public void showData();
	public double average();
}
class CStu implements Test
{
	protected String name;
	protected int math;
	protected int english;
	
	public CStu(String s,int m,int eng)
	{
		name=s;
		math=m;
		english=eng;
	}
	public void show()
	{
		showData();
		best();
		failed();
	}
	public void showData()
	{
		System.out.println("�m�W:"+name);
		System.out.println("�ƾǦ��Z:"+math);
		System.out.println("�^�妨�Z:"+english);
		System.out.println("�������Z:"+average());
	}
	public void best()
	{
		if(math>english)
			System.out.println(name+"���ƾǤ�^��n");
		else if(math<english)
			System.out.println(name+"���^���ƾǦn");
		else
			System.out.println(name+"���ƾǩM�^��@�˦n");
	}
	public void failed()
	{
		if(math<60)
			System.out.println(name+"���ƾǷ��F");
		if(english<60)
			System.out.println(name+"���^����F");
		if(math>=60 && english>=60)
			System.out.println(name+"���ƾǩM�^�峣�ή�");
	}
	public double average()
	{
		return (math+english)/2.0;
	}
}
public class Class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CStu stu=new CStu("Judy",58,91);
		stu.show();
	}

}
