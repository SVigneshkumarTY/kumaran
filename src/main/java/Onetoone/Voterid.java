package Onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="voterid")
public class Voterid {
	public Person getPerson1() {
		return person1;
	}
	public void setPerson1(Person person1) {
		this.person1 = person1;
	}
	@Id 
	@Column
	private int vid;
	@Column
	private String vname;
	@Column
	private int vage;
@OneToOne(mappedBy = "votercard")
private Person person1;
	public int getVage() {
		return vage;
	}
	public void setVage(int vage) {
		this.vage = vage;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}




	














































}
