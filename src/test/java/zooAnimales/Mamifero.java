package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	public final static String plural = "Mamiferos";
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos = 0;
	public static int leones = 0;
	private boolean pelaje;
	private int patas;

	public Mamifero() {
		this(null, 0, null, null, false, 0);
	}

	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.patas = patas;
		this.pelaje = pelaje;
		Mamifero.listado.add(this);
	}

	public static int cantidadMamiferos() {
		return Mamifero.listado.size();
	}

	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero.caballos++;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}

	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero.leones++;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
	}

	public static ArrayList<Mamifero> getListado() {
		return listado;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	
}