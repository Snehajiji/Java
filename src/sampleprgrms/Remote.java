package sampleprgrms;
interface TVremote
{
	public void volumeup();
	public void volumedown();
}
interface smartTvremote extends TVremote
{
	public void bluetooth();
	public void wifi();
}
class Tv implements smartTvremote
{

	@Override
	public void volumeup() 
	{
		System.out.println("Tv remote Volume up");
	}

	@Override
	public void volumedown() 
	{
		System.out.println("Tv remote volume down");
		
	}

	@Override
	public void bluetooth() 
	{
		System.out.println("smartTv bluetooth");
	}

	@Override
	public void wifi() 
	{
		System.out.println("smartTv wifi");
	}
}

public class Remote {

	public static void main(String[] args) 
	{
		Tv ob=new Tv();
		ob.volumeup();
		ob.volumedown();
		ob.bluetooth();
		ob.wifi();

	}

}
