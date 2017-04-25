package chapter02;

public class TV {
	//이렇게도 초기화를 할수 있다. (권장하는 방법은 아님. 생성자로 초기화 하는게 좋다.)
	//	private int channel = 7;
	//	private int volume = 20;
	//	private boolean power = false;

	private int channel;
	private int volume;
	private boolean power;

	public TV(int ch, int vol, boolean pow)
	{
		channel = ch;
		volume = vol;
		power = pow;
	}


	public int getChannel() {
		return channel;
	}


	public int getVolume() {
		return volume;
	}


	public boolean isPower() {
		return power;
	}


	public void status()
	{
		System.out.println("TV [channel=" + channel +", volume= " + volume + ", power=" + power +"]");
	}
	public void power(boolean on)
	{
		 power = on;

	}
	public void channel(boolean up)
	{
		if(up == true)
		{
			if(1 <= channel && channel <=255)
			{
				channel++;
			}
			else if (channel > 255)
			{
				 channel = 1;
				 channel++;
			}
			
		}
		else if(up == false)
		{
			if(1 <= channel && channel <=255)
			{
				channel--;
			}
			else if( channel < 1)
			{
				channel = 255;
				channel--;
			}
		}
		
	}
	public void channel(int n)
	{
		if(1 <= n && n <=255)
		{
			channel = n;
		}
		else if(  n <1 )
		{
			channel = 255;
		}
		else if(n >255)
		{
			channel = 0;
		}
			
	}
	public void volume(boolean up)
	{
		if(up == true)
		{
			if(1 <= volume && volume <=100)
			{
				volume++;
			}
			else
			{
				volume = 0;
			}
		
		}	
		else if(up == false)
		{
			if(1 <= volume && volume <=100)
			{
				volume--;
			}
			else
			{
				volume = 100;
			}
		}
			
		
	}
	public void volume(int n)
	{
		if(0 <= n && n<=100)
		{
			volume = n;
		}
		else if(n>100)
		{
			volume = 100;
		}
		else
		{
			volume = 0;
		}
	}

}
