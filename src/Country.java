
public class Country {

	private String name;
	private int population;
	
	//empty construct
	public Country() {}
	
	//overloaded construct
	public Country(String name, int population) {

		this.name = name;
		this.population = population;
	}
	//getters
	public String getName() {
		return name;
	}
	
	public int get() {
		return population;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPopulation(int population) {
		this.population = population;
	}
	
	//toString
	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + "]";
	}

	public int getPopulation() {
		return population;
	}

}

//private String name;
//private int population;
//
//public Country() {}
//
//public Country(String name, int population) {
//	this.name = name;
//	this.population = population;
//}
//
//public String getName() {
//	return name;
//}
//
//public void setName(String name) {
//	this.name = name;
//}
//
//public int getPopulation() {
//	return population;
//}
//
//public void setPopulation(int population) {
//	this.population = population;
//}
//
//@Override
//public String toString() {
//	return "Country [name=" + name + ", population=" + population + "]";
//}


