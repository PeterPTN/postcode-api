package peter.postcodeapi.postcode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity()
public class Postcode {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "postcode_id")
	private Long id;
	
	@Size(min = 4)
	@Column(name = "postcode_number")
	private int postcode;
	
	public Long getId() {
		return id;
	}

	public void setId(Long postcode_id) {
		this.id = postcode_id;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public Postcode() {}

	public Postcode(Long id, int postcode) {
		super();
		this.id = id;
		this.postcode = postcode;
	}
}
