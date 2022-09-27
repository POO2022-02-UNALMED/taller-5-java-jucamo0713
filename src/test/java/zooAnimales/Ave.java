package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	public static final String plural = "Aves";
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;

	public Ave() {
		this(null, 0, null, null, null);
	}

	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		Ave.listado.add(this);
	}

	public static int cantidadAves() {
		return Ave.listado.size();
	}

	public String movimiento() {
		return "volar";
	}

	public static ArrayList<Ave> getListado() {
		return listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave.halcones++;
		return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
	}

	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave.aguilas++;
		return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
	}
}