package be.pxl.generics.opdracht2;

public class Hoed<T> {
	
	public T dier = null;

	public Hoed(T dier) {
		super();
		this.dier = dier;
	}
	
	public T kijk() {
		return dier;	
	}

}
