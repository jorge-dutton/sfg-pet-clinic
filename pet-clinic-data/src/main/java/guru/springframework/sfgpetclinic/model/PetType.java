package guru.springframework.sfgpetclinic.model;

/**
 * PetType class stores pet's name
 * 
 * @author jorge.dutton
 *
 */
public class PetType extends BaseEntity {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
