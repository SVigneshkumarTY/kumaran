package manytomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="cours")
public class Course {
	
	@Id
	@Column
	
	private int id;
	@Column
	
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy ="cous") bidirectional
	private List<Students> student;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	

}
