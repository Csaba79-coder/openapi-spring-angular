package com.csaba79coder.openapispringangular.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_user")
public class User extends BaseEntity {

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;
}
