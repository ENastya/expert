/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.expert_system_sb;

import com.mycompany.expert_system_models.Criterion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hzhzx
 */
@Stateless
public class CriterionFacade extends AbstractFacade<Criterion> {

    @PersistenceContext(unitName = "com.mycompany_expert_system_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CriterionFacade() {
        super(Criterion.class);
    }
    
}
