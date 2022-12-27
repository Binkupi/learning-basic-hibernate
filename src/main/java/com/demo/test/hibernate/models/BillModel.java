package com.demo.test.hibernate.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "bill")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class BillModel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "id_customer",nullable = false)
    private int id_customer;

    @Column(name = "date")
    private Timestamp date;
    @Column(name = "description")
    private String description;

//    @ManyToMany
//    @JoinTable(name = "detail_bill",
//            joinColumns = { @JoinColumn(name = "id_bill") },
//            inverseJoinColumns = { @JoinColumn(name = "id_watch") })
//    private Set<WatchModel> watchList;

//    @OneToMany(mappedBy = "bill")
////    @JoinColumn(name = "id_bill")
//    private List<BillDetailModel> billDetailList;
//
//    public void addItem(BillDetailModel item) {
//        this. billDetailList.add(item);
//        item.setBill(this);
//    }

}
