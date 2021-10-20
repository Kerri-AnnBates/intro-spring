package com.local.catsanddogs.models;

import javax.persistence.*;

// Entity says that this is a class whose objects will be saved in a db.
@Entity
@Table(name = "cats")
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long catid;

    @Column(unique = true, nullable = false)
    String catname;

    public Cat() {}

    public long getCatid() {
        return catid;
    }

    public void setCatid(long catid) {
        this.catid = catid;
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }
}
