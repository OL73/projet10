package com.dvlk.p10.dto;

import java.util.HashSet;
import java.util.Set;

import com.dvlk.p10.bean.SalonRoleUtilisateur;

public class UtilisateurDTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nom;
	private String prenom;
	private Float note;
	private Float penalite;
	private Integer niveau;
	private Set<SalonRoleUtilisateur> salonRoleUtilisateurs = new HashSet<SalonRoleUtilisateur>(0);

	public UtilisateurDTO() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Float getNote() {
		return this.note;
	}

	public void setNote(Float note) {
		this.note = note;
	}

	public Float getPenalite() {
		return this.penalite;
	}

	public void setPenalite(Float penalite) {
		this.penalite = penalite;
	}

	public Integer getNiveau() {
		return this.niveau;
	}

	public void setNiveau(Integer niveau) {
		this.niveau = niveau;
	}

	public Set<SalonRoleUtilisateur> getSalonRoleUtilisateurs() {
		return this.salonRoleUtilisateurs;
	}

	public void setSalonRoleUtilisateurs(Set<SalonRoleUtilisateur> salonRoleUtilisateurs) {
		this.salonRoleUtilisateurs = salonRoleUtilisateurs;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getClass().getName());
		builder.append(" [id=");
		builder.append(this.id);
		builder.append(", nom=");
		builder.append(this.nom);
		builder.append(", prenom=");
		builder.append(this.prenom);
		builder.append(", note=");
		builder.append(this.note);
		builder.append(", penalite=");
		builder.append(this.penalite);
		builder.append(", niveau=");
		builder.append(this.niveau);
		builder.append(", salonRoleUtilisateurs=");
		builder.append(this.salonRoleUtilisateurs);
		builder.append("]");
		return builder.toString();
	}

}