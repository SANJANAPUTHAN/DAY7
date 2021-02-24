package day7;

public class ComputerCreation {
public static void main(String[] args) {
	Computer mycomputer=new Computer.ComputerBuild("HDDENABLED","16GBRAM").build();
	System.out.println(mycomputer);
	Computer mycomputer2=new Computer.ComputerBuild("HDD", "32gbram").setBluetooth("BLUTOOTH").build();
	System.out.println(mycomputer2);
}
}
class Computer
{
	private String HDD;
	private String RAM;
	private String Bluetooth;
	private String GamingCard;
	public final String getHDD() {
		return HDD;
	}
	public final void setHDD(String hDD) {
		HDD = hDD;
	}
	public final String getRAM() {
		return RAM;
	}
	public final void setRAM(String rAM) {
		RAM = rAM;
	}
	public final String getBluetooth() {
		return Bluetooth;
	}
	public final void setBluetooth(String bluetooth) {
		Bluetooth = bluetooth;
	}
	public final String getGamingCard() {
		return GamingCard;
	}
	public final void setGamingCard(String gamingCard) {
		GamingCard = gamingCard;
	}
	
	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", Bluetooth=" + Bluetooth + ", GamingCard=" + GamingCard
				+ "]";
	}
	Computer(ComputerBuild builder)
	{
		this.HDD=builder.getHDD();
		this.RAM=builder.getRAM();
		this.Bluetooth=builder.getBluetooth();
		this.GamingCard=builder.getGamingCard();
	}
	public static class ComputerBuild
	{
		private String HDD;
		private String RAM;
		private String Bluetooth;
		private String GamingCard;
		public final String getHDD() {
			return HDD;
		}
		public final void setHDD(String hDD) {
			HDD = hDD;
		}
		public final String getRAM() {
			return RAM;
		}
		public final void setRAM(String rAM) {
			RAM = rAM;
		}
		public final String getBluetooth() {
			return Bluetooth;
		}
		public final ComputerBuild setBluetooth(String bluetooth) {
			this.Bluetooth = bluetooth;
			return this;
		}
		public final String getGamingCard() {
			return GamingCard;
		}
		public final ComputerBuild setGamingCard(String gamingCard) {
			GamingCard = gamingCard;
			return this;
		}
		public Computer build()
		{
			return new Computer(this);
		}
		public ComputerBuild(String HDD,String RAM)
		{
			this.HDD=HDD;
			this.RAM=RAM;
		}
		
	}
}