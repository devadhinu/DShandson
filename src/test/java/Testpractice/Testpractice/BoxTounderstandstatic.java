package Testpractice.Testpractice;

 class Boxforstatic {
	
	int length;
	int breadth;
	int height;
	static int boxcount;
	
	Boxforstatic(int l,int b ,int h)
	{
		length=l;
		breadth=b;
		height=h;
		boxcount++;
	}

	Boxforstatic()
	{
		length=-1;
		breadth=-1;
		height=-1;
		boxcount++;
	}
	
	static 
	{
		System.out.println("from the static block");
		boxcount=0;
	}
	
	Boxforstatic(int l)
	{
		length=breadth=height=l;
		boxcount++;
	}

	Boxforstatic(Boxforstatic b)//contructor copy
	{
		
		length=b.length;
		breadth=b.breadth;
		height=b.height;
		boxcount++;
	
	}
	public void setDimension(int l,int b,int h)
	{
		length=l;
		breadth=b;
		height=h;
		boxcount++;
	}
	int volume() {
		return length*breadth*height;
	}
	
	boolean isEqual(Boxforstatic b)
	{
		if(length == b.length && breadth == b.breadth && height == b.height)
			
		return true;
		return false;
	}
	
	static void displayBoxCount()
	{
		System.out.println("The volume of balckbox "+ boxcount);
	}
}
	
	public class BoxTounderstandstatic{
		
    public static void main (String args[])
{

    Boxforstatic blackbox;
	
	blackbox = new Boxforstatic(5,4,3);
	
	blackbox.setDimension(6, 4, 3);
	
	System.out.println("The volume of balckbox "+ blackbox.volume());
	
	Boxforstatic woodbox = new Boxforstatic(7,4,3);
	
	woodbox.setDimension(10, 20, 30);
	
	System.out.println("The volume of balckbox "+ woodbox.volume());
	
	Boxforstatic b1 = new Boxforstatic(8,4,3);
	
	System.out.println("Whether blackbox equals"+ blackbox.isEqual(b1));
	
	Boxforstatic b2 = new Boxforstatic(b1);
	
	b2.length =10;
	
	System.out.println(Boxforstatic.boxcount);
	
	
	
	
	
}	

}
