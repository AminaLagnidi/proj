package ma.projet.restorant.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;



import javax.persistence.*;

@Entity
public class Ville {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "ville")
	@JsonIgnore
	private List<Zone> zones;

	public Ville() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Zone> getZones() {
		return zones;
	}

	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}

}