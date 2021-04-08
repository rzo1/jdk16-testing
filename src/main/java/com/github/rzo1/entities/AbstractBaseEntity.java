package com.github.rzo1.entities;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class AbstractBaseEntity implements Serializable {

    private static final long serialVersionUID = -9171955843866131901L;
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence-object")
    @SequenceGenerator(name = "sequence-object", sequenceName = "ID_MASTER_SEQ", allocationSize = 1, initialValue = 1)
    private Integer id;

    @Version
    private int version;

    public Integer getId() {
        return id;
    }

    public boolean isPersistent() {
        return isValidObjectID(getId());
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static boolean isValidObjectID(Integer id) {
        return id != null;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        } else if (!(obj instanceof AbstractBaseEntity)) {
            return false;
        } else if (((AbstractBaseEntity) obj).id == null || this.id == null) {
            return false;
        }
        return ((AbstractBaseEntity) obj).id.equals(this.id);
    }

    @Override
    public String toString() {
        return "entity." + this.getClass() + "[ id=" + id + " ] ";
    }
}
