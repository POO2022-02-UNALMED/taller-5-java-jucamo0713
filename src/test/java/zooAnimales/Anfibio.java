package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	public static final String plural = "Anfibios";
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas = 0;
	public static int salamandras = 0;
	private String colorPiel;
	private boolean venenoso;

	public Anfibio() {
		this(null, 0, null, null, null, false);
	}

	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		Anfibio.listado.add(this);
	}

	public static int cantidadAnfibios() {
		return Anfibio.listado.size();
	}

	public String movimiento() {
		return "saltar";
	}

	public static ArrayList<Anfibio> getListado() {
		return listado;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio.ranas++;
		return new Anfibio(nombre, edad, "selva",genero,"rojo", true);
	}

	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio.salamandras++;
		return new Anfibio(nombre, edad, "selva",genero,"negro y amarillo", false);
	}

}
