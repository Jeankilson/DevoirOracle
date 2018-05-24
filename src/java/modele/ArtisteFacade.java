/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import entite.Artiste;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Tech Support
 */
@Stateless
public class ArtisteFacade extends AbstractFacade<Artiste> {

    @PersistenceContext(unitName = "ProjetCulturel-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ArtisteFacade() {
        super(Artiste.class);
    }
    
}
