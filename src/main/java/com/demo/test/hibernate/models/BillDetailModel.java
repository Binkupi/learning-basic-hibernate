package com.demo.test.hibernate.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="detail_bill")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "watchID")
public class BillDetailModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_bill", nullable = false)
    private int billID;
//    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_watch", nullable = false)
    private int watchID;
    @Column(name = "amount", nullable = false)
    private int amount;
    @Column(name = "total_price", nullable = false)
    private long totalPrice;
    @Column(name = "pttt", nullable = false)
    private String pttt;
//    @ManyToOne
//    @JoinColumn(name = "id_bill")
//    private BillModel bill;




}
