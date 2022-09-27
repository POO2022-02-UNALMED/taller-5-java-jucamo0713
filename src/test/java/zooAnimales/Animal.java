package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Animal {
	protected static ArrayList<Class<? extends Animal>> childrens = new ArrayList<Class<? extends Animal>>();
	private static int totalAnimales = 0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona = new Zona[0];

	public Animal() {
		this(null, 0, null, null);
	}

	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		Animal.totalAnimales++;
	}

	public String movimiento() {
		return "desplazarse";
	}

	public String toString() {
		String response = "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en "
				+ this.habitat + " y mi genero es " + this.genero;
		if(this.zona.length>0){
			response += "la zona en la que me ubico es "+ this.zona[0].getNombre()+" , en el "+ this.zona[0].getZoo().getNombre();
		}
		return response;
	};

	public static String totalPorTipo() {
		String response = "";
		for (int i = 0; i < Animal.childrens.size(); i++) {
			Class<? extends Animal> x = Animal.childrens.get(i);
			try {
				String plural = (String) x.getField("plural").get(x);
				int total = (int) x.getDeclaredMethod("cantidad" + plural).invoke(x);
				response += plural + ": " + total;
			} catch (Exception e) {
			}
			if (i + 1 != Animal.childrens.size()) {
				response += "\n";
			}
		}
		return response;
	}

	public static int getTotalAnimales() {
		return totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public String getGenero() {
		return genero;
	}

	public Zona[] getZona() {
		return zona;
	}

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setZona(Zona[] zona) {
		this.zona = zona;
	}

	static {
		Class<? extends Animal> m = Mamifero.class.asSubclass(Animal.class);
		Animal.childrens.add(m);
		Class<? extends Animal> a = Ave.class.asSubclass(Animal.class);
		Animal.childrens.add(a);
		Class<? extends Animal> r = Reptil.class.asSubclass(Animal.class);
		Animal.childrens.add(r);
		Class<? extends Animal> p = Pez.class.asSubclass(Animal.class);
		Animal.childrens.add(p);
		Class<? extends Animal> an = Anfibio.class.asSubclass(Animal.class);
		Animal.childrens.add(an);
		;
	}
}
