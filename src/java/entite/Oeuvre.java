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
@Table(name = "OEUVRE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Oeuvre.findAll", query = "SELECT o FROM Oeuvre o")
    , @NamedQuery(name = "Oeuvre.findByNumoeuvre", query = "SELECT o FROM Oeuvre o WHERE o.numoeuvre = :numoeuvre")
    , @NamedQuery(name = "Oeuvre.findByNumartiste", query = "SELECT o FROM Oeuvre o WHERE o.numartiste = :numartiste")
    , @NamedQuery(name = "Oeuvre.findByNomoeuvre", query = "SELECT o FROM Oeuvre o WHERE o.nomoeuvre = :nomoeuvre")})
public class Oeuvre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMOEUVRE")
    private Integer numoeuvre;
    @Column(name = "NUMARTISTE")
    private Integer numartiste;
    @Size(max = 50)
    @Column(name = "NOMOEUVRE")
    private String nomoeuvre;

    public Oeuvre() {
    }

    public Oeuvre(Integer numoeuvre) {
        this.numoeuvre = numoeuvre;
    }

    public Integer getNumoeuvre() {
        return numoeuvre;
    }

    public void setNumoeuvre(Integer numoeuvre) {
        this.numoeuvre = numoeuvre;
    }

    public Integer getNumartiste() {
        return numartiste;
    }

    public void setNumartiste(Integer numartiste) {
        this.numartiste = numartiste;
    }

    public String getNomoeuvre() {
        return nomoeuvre;
    }

    public void setNomoeuvre(String nomoeuvre) {
        this.nomoeuvre = nomoeuvre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numoeuvre != null ? numoeuvre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oeuvre)) {
            return false;
        }
        Oeuvre other = (Oeuvre) object;
        if ((this.numoeuvre == null && other.numoeuvre != null) || (this.numoeuvre != null && !this.numoeuvre.equals(other.numoeuvre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Oeuvre[ numoeuvre=" + numoeuvre + " ]";
    }
    
}
