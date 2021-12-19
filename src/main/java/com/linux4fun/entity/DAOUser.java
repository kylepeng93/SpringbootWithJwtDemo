package com.linux4fun.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

/**
 * created by pengkai at 2021/12/19
 * 个人主页：https://kylepeng93.github.com
 */
@Entity
@Table(name = "user")
@Data
public class DAOUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String username;
    @Column
    @JsonIgnore
    private String password;
}
