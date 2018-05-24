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
@Table(name = "MANAGER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Manager.findAll", query = "SELECT m FROM Manager m")
    , @NamedQuery(name = "Manager.findByNuman", query = "SELECT m FROM Manager m WHERE m.numan = :numan")
    , @NamedQuery(name = "Manager.findByNom", query = "SELECT m FROM Manager m WHERE m.nom = :nom")
    , @NamedQuery(name = "Manager.findByPrenom", query = "SELECT m FROM Manager m WHERE m.prenom = :prenom")
    , @NamedQuery(name = "Manager.findBySexe", query = "SELECT m FROM Manager m WHERE m.sexe = :sexe")
    , @NamedQuery(name = "Manager.findByFonction", query = "SELECT m FROM Manager m WHERE m.fonction = :fonction")
    , @NamedQuery(name = "Manager.findBySalaire", query = "SELECT m FROM Manager m WHERE m.salaire = :salaire")
    , @NamedQuery(name = "Manager.findByBonus", query = "SELECT m FROM Manager m WHERE m.bonus = :bonus")})
public class Manager implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMAN")
    private Integer numan;
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
    @Column(name = "BONUS")
    private Double bonus;

    public Manager() {
    }

    public Manager(Integer numan) {
        this.numan = numan;
    }

    public Integer getNuman() {
        return numan;
    }

    public void setNuman(Integer numan) {
        this.numan = numan;
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

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numan != null ? numan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Manager)) {
            return false;
        }
        Manager other = (Manager) object;
        if ((this.numan == null && other.numan != null) || (this.numan != null && !this.numan.equals(other.numan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Manager[ numan=" + numan + " ]";
    }
    
}
