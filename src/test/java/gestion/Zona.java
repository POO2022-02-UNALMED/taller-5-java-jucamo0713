package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico[] zoo = new Zoologico[1];
	private ArrayList<Animal> animales = new ArrayList<Animal>();

	public Zona() {
		this(null, null);
	}

	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		if (zoo != null) {
			zoo.agregarZonas(this);
		}
	}

	public void agregarAnimales(Animal animal) {
		this.animales.add(animal);
		Zona[] x = { this };
		animal.setZona(x);
	}

	public int cantidadAnimales() {
		return this.animales.size();
	}

	public String getNombre() {
		return nombre;
	}

	public Zoologico getZoo() {
		return zoo[0];
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo[0] = zoo;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}

}
