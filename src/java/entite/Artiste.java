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
@Table(name = "ARTISTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Artiste.findAll", query = "SELECT a FROM Artiste a")
    , @NamedQuery(name = "Artiste.findByNumartiste", query = "SELECT a FROM Artiste a WHERE a.numartiste = :numartiste")
    , @NamedQuery(name = "Artiste.findByPrenom", query = "SELECT a FROM Artiste a WHERE a.prenom = :prenom")
    , @NamedQuery(name = "Artiste.findByNom", query = "SELECT a FROM Artiste a WHERE a.nom = :nom")
    , @NamedQuery(name = "Artiste.findBySexe", query = "SELECT a FROM Artiste a WHERE a.sexe = :sexe")
    , @NamedQuery(name = "Artiste.findByStyleartiste", query = "SELECT a FROM Artiste a WHERE a.styleartiste = :styleartiste")})
public class Artiste implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NUMARTISTE")
    private String numartiste;
    @Size(max = 50)
    @Column(name = "PRENOM")
    private String prenom;
    @Size(max = 50)
    @Column(name = "NOM")
    private String nom;
    @Size(max = 50)
    @Column(name = "SEXE")
    private String sexe;
    @Size(max = 50)
    @Column(name = "STYLEARTISTE")
    private String styleartiste;

    public Artiste() {
    }

    public Artiste(String numartiste) {
        this.numartiste = numartiste;
    }

    public String getNumartiste() {
        return numartiste;
    }

    public void setNumartiste(String numartiste) {
        this.numartiste = numartiste;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getStyleartiste() {
        return styleartiste;
    }

    public void setStyleartiste(String styleartiste) {
        this.styleartiste = styleartiste;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numartiste != null ? numartiste.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Artiste)) {
            return false;
        }
        Artiste other = (Artiste) object;
        if ((this.numartiste == null && other.numartiste != null) || (this.numartiste != null && !this.numartiste.equals(other.numartiste))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Artiste[ numartiste=" + numartiste + " ]";
    }
    
}
