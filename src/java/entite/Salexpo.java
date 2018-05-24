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
@Table(name = "SALEXPO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salexpo.findAll", query = "SELECT s FROM Salexpo s")
    , @NamedQuery(name = "Salexpo.findByNumsal", query = "SELECT s FROM Salexpo s WHERE s.numsal = :numsal")
    , @NamedQuery(name = "Salexpo.findByNumemp", query = "SELECT s FROM Salexpo s WHERE s.numemp = :numemp")
    , @NamedQuery(name = "Salexpo.findByNomsal", query = "SELECT s FROM Salexpo s WHERE s.nomsal = :nomsal")})
public class Salexpo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMSAL")
    private Integer numsal;
    @Column(name = "NUMEMP")
    private Integer numemp;
    @Size(max = 50)
    @Column(name = "NOMSAL")
    private String nomsal;

    public Salexpo() {
    }

    public Salexpo(Integer numsal) {
        this.numsal = numsal;
    }

    public Integer getNumsal() {
        return numsal;
    }

    public void setNumsal(Integer numsal) {
        this.numsal = numsal;
    }

    public Integer getNumemp() {
        return numemp;
    }

    public void setNumemp(Integer numemp) {
        this.numemp = numemp;
    }

    public String getNomsal() {
        return nomsal;
    }

    public void setNomsal(String nomsal) {
        this.nomsal = nomsal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numsal != null ? numsal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salexpo)) {
            return false;
        }
        Salexpo other = (Salexpo) object;
        if ((this.numsal == null && other.numsal != null) || (this.numsal != null && !this.numsal.equals(other.numsal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Salexpo[ numsal=" + numsal + " ]";
    }
    
}
