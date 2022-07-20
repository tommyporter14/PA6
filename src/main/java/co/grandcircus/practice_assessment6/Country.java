package co.grandcircus.practice_assessment6;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("countries")
public class Country{
	@Id
	private String id;
	
	private String name;
	private String continent; 
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public Country() {
		
	}
	
	public Country(String id, String name, String continent) {
		this.id = id; 
		this.name = name;
		this.continent = continent;
	}
}