package manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="stude")
public class Students {
	@Id
	@Column
		private int id;
	@Column
		private String name;

	@ManyToMany(cascade =CascadeType.ALL)
	
	
	@JoinTable(name ="students_courses",joinColumns = @JoinColumn(name="sid"),
	inverseJoinColumns =@JoinColumn(name ="cid"))
	
	private List<Course>course;
	
	
	
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
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
