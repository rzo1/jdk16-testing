package com.github.rzo1.service;


import com.github.rzo1.entities.DemoEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class DemoPersistenceService {

    @PersistenceContext(unitName = "demo")
    private EntityManager em;

    public List<DemoEntity> getDemos() {
        return new ArrayList<>(em.createNamedQuery(DemoEntity.GET_ALL, DemoEntity.class).getResultList());
    }

}
