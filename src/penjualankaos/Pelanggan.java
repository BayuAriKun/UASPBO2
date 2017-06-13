/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penjualankaos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Bay Lee
 */
@Entity
public class Pelanggan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Nama_Pelanggan;
    private String Alamat_Pelanggan;
    private String Jekel_Pelanggan;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Pelanggan)) {
            return false;
        }
        Pelanggan other = (Pelanggan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "penjualankaos.Pelanggan[ id=" + id + " ]";
    }
    public String getNama_Pelanggan() {
        return Nama_Pelanggan;
    }

    /**
     * @param Nama_Pelanggan the Nama_Pelanggan to set
     */
    public void setNama_Pelanggan(String Nama_Pelanggan) {
        this.Nama_Pelanggan = Nama_Pelanggan;
    }

    /**
     * @return the Alamat_Pelanggan
     */
    public String getAlamat_Pelanggan() {
        return Alamat_Pelanggan;
    }

    /**
     * @param Alamat_Pelanggan the Alamat_Pelanggan to set
     */
    public void setAlamat_Pelanggan(String Alamat_Pelanggan) {
        this.Alamat_Pelanggan = Alamat_Pelanggan;
    }
    
     /**
     * @return the Jekel_Pelanggan
     */
    public String getJekel_Pelanggan() {
        return Jekel_Pelanggan;
    }

    /**
     * @param Jekel_Pelanggan
     */
    public void setJekel_Pelanggan(String Jekel_Pelanggan) {
        this.Jekel_Pelanggan = Jekel_Pelanggan;
    }
    
}
