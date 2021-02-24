package day7;

public class GovernmentProxyDemo {
public static void main(String[] args) {
	Police police=new Police();
	Hotel hotel=new Hotel();
	Corporation corporation=new Corporation();
	Hospital hospital=new Hospital();
	
	command c1=new OpenhotelCommand(police, hotel, corporation, hospital);
	command c2=new OrphandeadCommand(police, hotel, corporation, hospital);
	command c3=new ForeignDeathCommand(police, hotel, corporation, hospital);
	
	eSeva e=new eSeva();
	e.setCommand(c1, 0);
	e.setCommand(c2, 1);
	e.setCommand(c3, 2);
	
	e.getcommand(0);
}
}
class eSeva
{
	command[] c=new command[5];
	eSeva()
	{
		for(int i=0;i<5;i++)
		{
			c[i]=new dummy();
		}
	}
	public void getcommand(int slot)
	{
		c[slot].execute();
	}
	public void setCommand(command c,int slot)
	{
		this.c[slot]=c;
	}
	class dummy extends command
	{

		@Override
		public void execute() {
			// TODO Auto-generated method stub
			System.out.println("do nothing...");
			
		}
		
	}
}
abstract class command
{
	Police police;Hotel hotel;Corporation corporation;Hospital hospital;
	public command(Police police, Hotel hotel, Corporation corporation, Hospital hospital) {
		super();
		this.police = police;
		this.hotel = hotel;
		this.corporation = corporation;
		this.hospital = hospital;
	}

	command()
	{
		
	}
	
	public abstract void execute();
}
class OpenhotelCommand extends command{
	
	public OpenhotelCommand(Police police, Hotel hotel, Corporation corporation, Hospital hospital) {
		super(police, hotel, corporation, hospital);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("hotelopeneing process started...");
		hotel.CheckQuality();
		hotel.IssueClearance();
		police.doCertificate();
		corporation.doInspection();
		corporation.IssueCertificate();
		System.out.println("hotel opened...");
	}
	
}
class OrphandeadCommand extends command
{
	

	public OrphandeadCommand(Police police, Hotel hotel, Corporation corporation, Hospital hospital) {
		super(police, hotel, corporation, hospital);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("orpan death clearance process started...");
		police.doInvestigation();
		police.doCertificate();
		hospital.doPostMortem();
		hospital.getCertificate();
		corporation.IssueCertificate();
		System.out.println("orphan body buried...");
		
	}
	
}
class ForeignDeathCommand extends command
{
	
	public ForeignDeathCommand(Police police, Hotel hotel, Corporation corporation, Hospital hospital) {
		super(police, hotel, corporation, hospital);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("foreign death clearance process started...");
		police.doInvestigation();
		police.doCertificate();
		hospital.doPostMortem();
		hospital.getCertificate();
		corporation.IssueCertificate();
		System.out.println("foreign body sent...");
		
	}
	
}
class Police
{
	public final void doInvestigation()
	{
		System.out.println("investigation on process...");
	}
	public final void doCertificate()
	{
		System.out.println("certificate copy uploaded...");
	}
}
class Corporation
{
	public final void doInspection()
	{
		System.out.println("corporation inspection processing..");
	}
	public final void IssueCertificate()
	{
		System.out.println("Issuing certificate...");
	}
	
}
class Hospital
{
	public final void doPostMortem()
	{
		System.out.println("postmortem process....");
	}
	public final void getCertificate()
	{
		System.out.println("issuing clearance certificate...");
	}
}
class Hotel
{
	public final void CheckQuality()
	{
		System.out.println("checking food quality...");
	}
	public final void IssueClearance()
	{
		System.out.println("permision to open the hotel...");
	}
}