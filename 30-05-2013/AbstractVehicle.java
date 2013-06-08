abstract class Vehicle
{
	abstract void color();
}

class Car extends Vehicle
{
	void color()
	{
		System.out.println("Inside Car");
	}
}

class Bus extends Vehicle
{
	void color()
	{
		System.out.println("Inside Bus");
	}
}


class AbstractVehicle
{
	public static void main(String[] args)
	{
		Bus b = new Bus();
		Car c = new Car();
		Vehicle vh = new Vehicle();
		b.color();
		c.color();
		vh.color();
	}
}