package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	public static final String plural = "Peces";
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones = 0;
	public static int bacalaos = 0;
	private String colorEscamas;
	private int cantidadAletas;

	public Pez() {
		this(null, 0, null, null, null, 0);
	}

	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		Pez.listado.add(this);
	}

	public static int cantidadPeces() {
		return Pez.listado.size();
	}

	public String movimiento() {
		return "nadar";
	}

	public static ArrayList<Pez> getListado() {
		return listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}


	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez.salmones++;
		return new Pez(nombre, edad, "oceano", genero, "rojo", 7);
	}

	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez.bacalaos++;
		return new Pez(nombre, edad, "oceano", genero, "gris", 7);
	}

}
