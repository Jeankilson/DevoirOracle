/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import entite.Oeuvre;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Tech Support
 */
@Stateless
public class OeuvreFacade extends AbstractFacade<Oeuvre> {

    @PersistenceContext(unitName = "ProjetCulturel-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OeuvreFacade() {
        super(Oeuvre.class);
    }
    
}
