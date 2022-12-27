package com.demo.test.hibernate.daos;

import com.demo.test.hibernate.models.BillModel;

public interface IBillDAO {
    public BillModel findById(int id) throws Exception;

}
