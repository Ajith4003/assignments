package ajith1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)

public class City {

	private int id;
	private String name;
	
	private String country;
	private int population;
	
}