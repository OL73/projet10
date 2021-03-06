package com.dvlk.p10.bean;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sport", catalog = "projet10")
public class Sport implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nom;
	private String description;
	private Set<Salon> salons = new HashSet<Salon>(0);

	public Sport() {
	}

	public Sport(String nom) {
		this.nom = nom;
	}

	public Sport(String nom, String description, Set<Salon> salons) {
		this.nom = nom;
		this.description = description;
		this.salons = salons;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "nom", nullable = false, length = 150)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "description", length = 65535)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sport")
	public Set<Salon> getSalons() {
		return this.salons;
	}

	public void setSalons(Set<Salon> salons) {
		this.salons = salons;
	}

}
