package com.LetsMeet.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Sondage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

}



