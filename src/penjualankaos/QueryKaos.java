/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penjualankaos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 *
 * @author Bay Lee
 */
public class QueryKaos {
    public void Add (Object object){
        EntityManagerFactory emf;
        emf = javax.persistence.Persistence.createEntityManagerFactory("PenjualanKaosPU");
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();
        try {
                em.persist(object);
                em.getTransaction().commit();
        } catch (Exception e) {
                em.getTransaction().rollback();
        } finally {
                em.close();
        }
    }
    
    public void update(long id,String nama_pelanggan,String jekel_pelanggan,String alamat_pelanggan){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("PenjualanKaosPU");
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();
        em.createQuery("UPDATE Tamu e SET e.Nama_Pelanggan=?1,e.Jekel_Pelanggan=?2,e.Alamat_Pelanggan=?3 WHERE e.id=?3",Pelanggan.class)
                .setParameter(1, nama_pelanggan)
                .setParameter(2, jekel_pelanggan)
                .setParameter(3, alamat_pelanggan)
                .setParameter(4,id)
                .executeUpdate();       
        em.getTransaction().commit();
  }
    
    
public void hapus(long id){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("PenjualanKaosPU");
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();
        int hapusyu=em.createQuery("DELETE FROM Pelanggan e WHERE e.id=:par").setParameter("par", id).executeUpdate();
        em.getTransaction().commit();
}
  public void Show() {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("PenjualanKaosPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT e FROM Pelanggan e");
        List<Pelanggan> result = query.getResultList();
        for (Pelanggan e : result) {
                 System.out.println("ID PELANGGAN :"+ e.getId() + "\n NAMA :" + e.getNama_Pelanggan()+"\n Alamat :"+ e.getAlamat_Pelanggan());   
        }
  }

    void update(long id, String nama_pelanggan, String alamat_pelanggan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
