package com.demo.test.hibernate.daos;

import com.demo.test.hibernate.models.BillModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository

public class BillDAO {
    @Autowired
    private EntityManager entityManager;

    public BillDAO() {
    }
//    @Override
//@Transactional
    public BillModel findById(int id) throws Exception{
        return this.entityManager.find(BillModel.class, id);
    }

    public List<BillModel> findByIdByQuery() throws Exception{
        String sql = "Select new " + BillModel.class.getName() //
                + "(e.id) " //
                + " from " + BillModel.class.getName() + " e ";
        Query query = entityManager.createQuery(sql, BillModel.class);
        return query.getResultList();
    }


    public void insertWithQuery(BillModel bill) {
        entityManager.createNativeQuery("INSERT INTO bill (id, id_customer, date, description) VALUES (?,?,?,?)")
                .setParameter(1, bill.getId())
                .setParameter(2, bill.getId_customer())
                .setParameter(3, bill.getDate())
                .setParameter(4, bill.getDescription())
                .executeUpdate();
    }
//    @Transactional(noRollbackFor=RuntimeException.class)
//@Transactional
    public void insertWithEntityManager(BillModel bill) {
        entityManager.persist(bill);
    }
    public void Insert(List<BillModel> bills) throws Exception{
        try{
            for(BillModel bill : bills){
                insertWithEntityManager(bill);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
