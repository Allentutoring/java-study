package com.tutoring.javastudy.auth;

import com.tutoring.javastudy.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class UserEntity extends BaseEntity {

    @Id
    @GeneratedValue
    private int idx;

    @Column
    private String id;

    @Column
    private String name;

    @Column
    private String password;
}
