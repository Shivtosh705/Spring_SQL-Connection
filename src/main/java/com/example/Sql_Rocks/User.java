package com.example.Sql_Rocks;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //so that hibernate can identify whose attributes to pick for table creation
@Table(name="user_info") //This is just for giving table name, bydefault: tableName=className
public class User {

    @Id  //It is written on attribute which has to become primary key
    @Column(unique = true)
    private int id;

    private String name;

    @Column(unique = true)
    private String email;

    private  String age;

    private String mobNo;

    @Column(name="country_name")
    private String country;

    //Always create the default constructor-->for beans in spring

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    User(){

    }

    //good practice is to create all args constructor


    public User(int id, String name, String age,String mobNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobNo=mobNo;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
//getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
