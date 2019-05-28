/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.expert_system_models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hzhzx
 */
@Entity
@Table(name = "criterion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Criterion.findAll", query = "SELECT c FROM Criterion c"),
    @NamedQuery(name = "Criterion.findById", query = "SELECT c FROM Criterion c WHERE c.id = :id"),
    @NamedQuery(name = "Criterion.findByName", query = "SELECT c FROM Criterion c WHERE c.name = :name"),
    @NamedQuery(name = "Criterion.findByWeight", query = "SELECT c FROM Criterion c WHERE c.weight = :weight"),
    @NamedQuery(name = "Criterion.findBySubject", query = "SELECT c FROM Criterion c WHERE c.subject = :subject"),
    @NamedQuery(name = "Criterion.findByCrgroup", query = "SELECT c FROM Criterion c WHERE c.crgroup = :crgroup")})
public class Criterion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "weight")
    private float weight;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "subject")
    private String subject;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "crgroup")
    private String crgroup;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "criterion")
    private List<Mark> markList;

    public Criterion() {
    }

    public Criterion(Integer id) {
        this.id = id;
    }

    public Criterion(Integer id, String name, float weight, String subject, String crgroup) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.subject = subject;
        this.crgroup = crgroup;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCrgroup() {
        return crgroup;
    }

    public void setCrgroup(String crgroup) {
        this.crgroup = crgroup;
    }

    @XmlTransient
    public List<Mark> getMarkList() {
        return markList;
    }

    public void setMarkList(List<Mark> markList) {
        this.markList = markList;
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
        if (!(object instanceof Criterion)) {
            return false;
        }
        Criterion other = (Criterion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.expert_system_models.Criterion[ id=" + id + " ]";
    }
    
}
