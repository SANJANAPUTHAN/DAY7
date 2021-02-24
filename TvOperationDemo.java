package day7_Exercise;

public class TvOperationDemo {
public static void main(String[] args) {
	tv TV=new tv();
	xbox XBOX=new xbox();
	hometheatre ht=new hometheatre();
	firestick fs=new firestick();
	
	Command c1=new TVCommand(TV,XBOX,ht,fs);
	Command c2=new XboxCommand(TV,XBOX,ht,fs);
	
	Remote r1=new Remote();
	r1.setCommand(c1, 0);
	r1.setCommand(c2, 1);
	
	r1.execute(0);
	r1.execute(1);
}
}
class Remote
{
	Command[] c=new Command[5];
	Remote()
	{
		for(int i=0;i<5;i++)
		{
			c[i]=new donothing();
		}
	}
	public void execute(int slot)
	{
		c[slot].command();
	}
	public void setCommand(Command command,int slot)
	{
		this.c[slot]=command;
	}
	class donothing extends Command
	{

		@Override
		public void command() {
			// TODO Auto-generated method stub
			System.out.println("nothing executed...");
			
		}
		
	}
}
abstract class Command
{
	tv TV;xbox XBOX;hometheatre ht;firestick fs;	
	Command()
	{
		//
	}
	public Command(tv tV, xbox xBOX, hometheatre ht, firestick fs) {
		super();
		this.TV = tV;
		this.XBOX = xBOX;
		this.ht = ht;
		this.fs = fs;
	}
	public abstract void command();
}

class TVCommand extends Command
{

	public TVCommand(tv tV, xbox xBOX, hometheatre ht, firestick fs) {
		super(tV, xBOX, ht, fs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void command() {
		// TODO Auto-generated method stub
		System.out.println("tv switching on...");
		TV.watchNews();
		ht.highvolume();
		System.out.println("tv switching off...");
		
	}
}
class XboxCommand extends Command
{

	public XboxCommand(tv tV, xbox xBOX, hometheatre ht, firestick fs) {
		super(tV, xBOX, ht, fs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void command() {
		// TODO Auto-generated method stub
		System.out.println("xbox switching on...");
		XBOX.playmusic();
		ht.lowvolume();
		System.out.println("xbox switching off...");
		
	}
	
}
class hometheatreCommand extends Command
{

	public hometheatreCommand(tv tV, xbox xBOX, hometheatre ht, firestick fs) {
		super(tV, xBOX, ht, fs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void command() {
		// TODO Auto-generated method stub
		System.out.println("hometheatre switching on...");
		ht.lowvolume();
		System.out.println("hometheatre switching off...");
		
	}
	
}
class firestickCommand extends Command
{

	public firestickCommand(tv tV, xbox xBOX, hometheatre ht, firestick fs) {
		super(tV, xBOX, ht, fs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void command() {
		// TODO Auto-generated method stub
		System.out.println("firestick switching on...");
		fs.playseries();
		ht.highvolume();
		System.out.println("firestick switching off...");
		
	}
	
}
class tv
{
	public final void watchNews()
	{
		System.out.println("Play news channel...");
	}
	public final void watchSports()
	{
		System.out.println("Play sports channel...");
	}
}
class xbox
{
	public final void playgames()
	{
		System.out.println("play games...");
	}
	public final void playmusic()
	{
		System.out.println("play music...");
	}
}
class hometheatre
{
	public final void highvolume()
	{
		System.out.println("set to high volume...");
	}
	public final void lowvolume()
	{
		System.out.println("set to low volume...");
	}
}
class firestick
{
	public final void playmovies()
	{
		System.out.println("play movies...");
	}
	public final void playseries()
	{
		System.out.println("play series...");
	}
}
