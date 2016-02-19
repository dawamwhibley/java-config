/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojur.entity;

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
 * @author Gaea
 */
@Entity
@Table(name = "tb_1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tb1.findAll", query = "SELECT t FROM Tb1 t"),
    @NamedQuery(name = "Tb1.findById", query = "SELECT t FROM Tb1 t WHERE t.id = :id"),
    @NamedQuery(name = "Tb1.findByIsi", query = "SELECT t FROM Tb1 t WHERE t.isi = :isi")})
public class Tb1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "isi")
    private String isi;

    public Tb1() {
    }

    public Tb1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb1)) {
            return false;
        }
        Tb1 other = (Tb1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pojur.entity.Tb1[ id=" + id + " ]";
    }
    
}
