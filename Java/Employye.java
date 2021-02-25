import java.util.*;

class Employee{

	private String name;
	private String address;
	private String mobile;

	public void getName()
	{
		return name;
	}
	public void setName()
	{
		this.name=name;
	}
	public void getAddress()
	{
		return address;
	}
	public void setAddress()
	{
		this.address=address;
	}
	public void getMobile()
	{
		return mobile;
	}
	public void setMobile()
	{
		mobile=mob;
	}
	public display()
	{
		System.out.println("Name of the Employee:"+getName());
		System.out.println("Address of the Employee:"+getAddress());
		System.out.println("Mobile No. of the Employee:"+getName());
	}
}