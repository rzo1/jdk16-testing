package com.github.rzo1.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = DemoEntity.TABLE_NAME)
@NamedQueries({
        @NamedQuery(name = DemoEntity.GET_ALL, query = "select r from DemoEntity r"),
})
public class DemoEntity extends AbstractBaseEntity {

    public static final String TABLE_NAME = "demo";
    public static final String GET_ALL = "roleAll";

    @NotNull
    @Column(nullable = false, unique = true)
    private String role;

    protected DemoEntity() {
    }

    public DemoEntity(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}