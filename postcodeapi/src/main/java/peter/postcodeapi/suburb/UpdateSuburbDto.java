package peter.postcodeapi.suburb;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UpdateSuburbDto {
	@Size(min = 1, max = 50)
	private String name;

	@Pattern(regexp="[0-9]+")
	@Max(99999)
	@Size(min = 1, max = 5)
	private int population;
	
	@Pattern(regexp="[0-9]+")
	@Size(min = 4)
	private int postcode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
}
