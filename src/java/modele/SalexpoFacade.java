/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import entite.Salexpo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Tech Support
 */
@Stateless
public class SalexpoFacade extends AbstractFacade<Salexpo> {

    @PersistenceContext(unitName = "ProjetCulturel-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SalexpoFacade() {
        super(Salexpo.class);
    }
    
}
