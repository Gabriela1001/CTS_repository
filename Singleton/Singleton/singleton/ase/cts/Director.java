package singleton.ase.cts;

public class Director{
	private String nume;
	private int varsta;
	
	private static Director instanta = null;
	
	private Director(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
	}
	
	public synchronized  static Director getInstance(String name) {
		if(instanta==null)
		{
			instanta = new Director(name,30);
		}
		return instanta;
	}

	@Override
	public String toString() {
		return "Director [nume=" + nume + ", varsta=" + varsta + "]";
	}
	
	
	
}
