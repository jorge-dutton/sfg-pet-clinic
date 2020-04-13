package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
	private Long id; // Hibernate recommends to use boxed types because their
						// can be null

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
