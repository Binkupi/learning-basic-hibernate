package com.demo.test.hibernate.services;

import com.demo.test.hibernate.daos.BillDAO;
import com.demo.test.hibernate.daos.BillRepository;
import com.demo.test.hibernate.models.BillModel;
import com.demo.test.hibernate.models.ModelGroupBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

@Service
public class BillService {
    @Autowired
    private BillDAO billDao;
    @Autowired
    private BillRepository billRepository;

    public BillModel findById(int id) throws Exception{
//        return billDao.findById(id);
        return billRepository.findById(id).get();

    }

    public List<BillModel> findByIdByQuery() throws Exception{
        return billDao.findByIdByQuery();
    }

    @Transactional
    public void Insert(List<BillModel> bills) throws Exception{
        billRepository.saveAll(bills);
        throw new Exception("test");
    }

    public List<BillModel> searchDesc(String desc) throws Exception{
         return billRepository.findByDescriptionContaining(desc);
    }
    public List<BillModel> findAll() throws Exception{
        return billRepository.findAll();
    }

    public Map<String, List<BillModel>> testGroupBy() throws Exception{
        List<BillModel> listBill = billRepository.findAll();
        Map<String, List<BillModel>> map = listBill.stream().collect(groupingBy(BillModel::getDescription));
        return map;
    }

    public Map<ModelGroupBy, List<BillModel>> testGroupByClass() throws Exception{
        List<BillModel> listBill = billRepository.findAll();
        Map<ModelGroupBy, List<BillModel>> map = listBill.stream().collect(groupingBy(bill->new ModelGroupBy(bill.getId_customer(), bill.getDescription()) ));
        return map;
    }

    public Map<String, Map<Integer,List<BillModel>>> testGroupByChain() throws Exception{
        List<BillModel> listBill = billRepository.findAll();
        Map<String, Map<Integer,List<BillModel>>> map = listBill.stream().collect(groupingBy(BillModel::getDescription, groupingBy(BillModel::getId)));
        return map;
    }

    public Map<String,Integer> testGroupBySum() throws Exception{
        List<BillModel> listBill = billRepository.findAll();
        Map<String,Integer> map = listBill.stream().collect(groupingBy(BillModel::getDescription,summingInt(BillModel::getId)));
        return map;
    }

}
