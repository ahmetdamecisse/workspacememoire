/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gdc.test.jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Abdoulahi
 */
@Entity
@Table(name = "bdd")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bdd.findAll", query = "SELECT b FROM Bdd b"),
    @NamedQuery(name = "Bdd.findByIdTypeDeProfil", query = "SELECT b FROM Bdd b WHERE b.idTypeDeProfil = :idTypeDeProfil"),
    @NamedQuery(name = "Bdd.findByDomaine", query = "SELECT b FROM Bdd b WHERE b.domaine = :domaine"),
    @NamedQuery(name = "Bdd.findByNiveau", query = "SELECT b FROM Bdd b WHERE b.niveau = :niveau")})
public class Bdd implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTypeDeProfil")
    private Integer idTypeDeProfil;
    @Size(max = 254)
    @Column(name = "domaine")
    private String domaine;
    @Size(max = 254)
    @Column(name = "niveau")
    private String niveau;
    @JoinColumn(name = "idTypeDeProfil", referencedColumnName = "idTypeDeProfil", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Profilgl profilgl;

    public Bdd(Integer idTypeDeProfil, Profilgl profilgl) {
        this.idTypeDeProfil = idTypeDeProfil;
        this.profilgl = profilgl;
    }

    public Bdd() {
    }

    public Bdd(Integer idTypeDeProfil) {
        this.idTypeDeProfil = idTypeDeProfil;
    }

    public Integer getIdTypeDeProfil() {
        return idTypeDeProfil;
    }

    public void setIdTypeDeProfil(Integer idTypeDeProfil) {
        this.idTypeDeProfil = idTypeDeProfil;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public Profilgl getProfilgl() {
        return profilgl;
    }

    public void setProfilgl(Profilgl profilgl) {
        this.profilgl = profilgl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTypeDeProfil != null ? idTypeDeProfil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bdd)) {
            return false;
        }
        Bdd other = (Bdd) object;
        if ((this.idTypeDeProfil == null && other.idTypeDeProfil != null) || (this.idTypeDeProfil != null && !this.idTypeDeProfil.equals(other.idTypeDeProfil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Bdd[ idTypeDeProfil=" + idTypeDeProfil + " ]";
    }
    
}
