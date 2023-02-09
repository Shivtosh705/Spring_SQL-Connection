package com.example.Sql_Rocks;


import jakarta.persistence.*;

@Entity
@Table(name="Library_card")
public class LibraryCard {

    @Id
    private int cardNo;

    private int fine;

    private int bookIssued;

    @Enumerated(value = EnumType.STRING) //To store value in db in String format
    private CardStatus cardStatus;


    //Child class will have the foreign key of the parent class:through
    //it connects to other table
    @OneToOne //mapping relation between two entity
    @JoinColumn //you are telling:add a foreign key column -----> define the column name of the parent class,by default its the primary key of parent class
    User user;
}
