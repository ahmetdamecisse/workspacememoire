/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdc.sessionsbeans;

import com.gdc.entites.Outils;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author a618092
 */
@Stateless
public class OutilsFacade extends AbstractFacade<Outils> {
    @PersistenceContext(unitName = "com.gdc_atosgdcmetier_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OutilsFacade() {
        super(Outils.class);
    }
    
}
