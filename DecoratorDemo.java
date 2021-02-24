package day7;

public class DecoratorDemo {
public static void main(String[] args) {
	IceCream ice=new Vanilla(new chocolate(new nuts()));
	System.out.println(ice.cost());
}
}
abstract class IceCream
{
	public abstract int cost();
}
abstract class Cream extends IceCream{}
abstract class IcecreamIngredients extends IceCream{}
class Vanilla extends Cream
{
	IceCream icecream;
	Vanilla()
	{
		
	}
	Vanilla(IceCream icecream)
	{
		this.icecream=icecream;

	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(icecream==null)
		{
			return 0;
		}
		return 10+this.icecream.cost();
	}
	
}
class chocolate extends Cream
{
	IceCream icecream;
	chocolate()
	{
		
	}
	chocolate(IceCream icecream)
	{
		this.icecream=icecream;

	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(icecream==null)
		{
			return 0;
		}
		return 10+this.icecream.cost();
	}
	
}
class Strawberry extends Cream
{
	IceCream icecream;
	Strawberry()
	{
		
	}
	Strawberry(IceCream icecream)
	{
		this.icecream=icecream;

	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(icecream==null)
		{
			return 0;
		}
		return 10+this.icecream.cost();
	}
	
}
class nuts extends IcecreamIngredients
{
	IceCream icecream;
	nuts()
	{
		
	}
	nuts(IceCream icecream)
	{
		this.icecream=icecream;

	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(icecream==null)
		{
			return 0;
		}
		return 10+this.icecream.cost();
	}
}

class dryfruits extends IcecreamIngredients
{
	IceCream icecream;
	dryfruits()
	{
		
	}
	dryfruits(IceCream icecream)
	{
		this.icecream=icecream;

	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(icecream==null)
		{
			return 0;
		}
		return 10+this.icecream.cost();
	}
}