package _009_generic_interface;

public class ShippableAbstractCrate<U> implements Shippable<U> {

	@Override
	public void ship(U t) {
		System.out.println("generic_interface: " + t);
	}
}