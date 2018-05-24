/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tech Support
 */
@Entity
@Table(name = "EMPLOYE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employe.findAll", query = "SELECT e FROM Employe e")
    , @NamedQuery(name = "Employe.findByNumemp", query = "SELECT e FROM Employe e WHERE e.numemp = :numemp")
    , @NamedQuery(name = "Employe.findByNom", query = "SELECT e FROM Employe e WHERE e.nom = :nom")
    , @NamedQuery(name = "Employe.findByPrenom", query = "SELECT e FROM Employe e WHERE e.prenom = :prenom")
    , @NamedQuery(name = "Employe.findBySexe", query = "SELECT e FROM Employe e WHERE e.sexe = :sexe")
    , @NamedQuery(name = "Employe.findByFonction", query = "SELECT e FROM Employe e WHERE e.fonction = :fonction")
    , @NamedQuery(name = "Employe.findBySalaire", query = "SELECT e FROM Employe e WHERE e.salaire = :salaire")})
public class Employe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMEMP")
    private Integer numemp;
    @Size(max = 50)
    @Column(name = "NOM")
    private String nom;
    @Size(max = 50)
    @Column(name = "PRENOM")
    private String prenom;
    @Size(max = 50)
    @Column(name = "SEXE")
    private String sexe;
    @Size(max = 50)
    @Column(name = "FONCTION")
    private String fonction;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SALAIRE")
    private Double salaire;

    public Employe() {
    }

    public Employe(Integer numemp) {
        this.numemp = numemp;
    }

    public Integer getNumemp() {
        return numemp;
    }

    public void setNumemp(Integer numemp) {
        this.numemp = numemp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numemp != null ? numemp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employe)) {
            return false;
        }
        Employe other = (Employe) object;
        if ((this.numemp == null && other.numemp != null) || (this.numemp != null && !this.numemp.equals(other.numemp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Employe[ numemp=" + numemp + " ]";
    }
    
}
