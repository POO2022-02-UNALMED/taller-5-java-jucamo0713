package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();

	public Zoologico() {
		this(null, null);
	}

	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
		zona.setZoo(this);
	}

	public int cantidadTotalAnimales() {
		int count = 0;
		for (int i = 0; i < this.zonas.size(); i++) {
			count += this.zonas.get(i).cantidadAnimales();
		}
		return count;
	}

	public String getNombre() {
		return nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public ArrayList<Zona> getZona() {
		return zonas;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public void setZona(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}

}
