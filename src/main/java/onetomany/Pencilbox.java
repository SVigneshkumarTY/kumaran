package onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import javax.persistence.Table;

@Entity
@Table(name="pencibx")


public class Pencilbox {
@Column
	private String name;
@Id
@Column
@JoinColumn(name="id",nullable =false)
	private int id;

	@OneToMany(cascade=CascadeType.ALL)
	
	
	List<Pencil>pencil1;
	
		public List<Pencil> getPencil() {
		return pencil1;
	}
	public void setPencil(List<Pencil> pencil) {
		this.pencil1 = pencil;
	}
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
		
	

}
