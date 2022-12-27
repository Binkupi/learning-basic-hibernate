package com.demo.test.hibernate.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="watch")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class WatchModel {
    @Id
    private int id;
    private int gender;
    private String name;
    private long price;
    private int sale;
    private int size;
    private String color;
    private String chain;
    private String img;
    private int checked;
    private int soluong;
    private int maloai;
    private String description;
//    @ManyToMany(mappedBy="watchList")
//    private Set<BillModel> billList;
}
