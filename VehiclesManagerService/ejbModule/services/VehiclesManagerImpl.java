package services;

import java.util.Collection;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Commande;
import entities.Vehicles;

@Stateless
public class VehiclesManagerImpl implements VehiclesManager {
	@PersistenceContext(name = "VehiclesService")
	EntityManager em;
	
	public VehiclesManagerImpl() {
		
	}
	
	public VehiclesManagerImpl(EntityManager em) {
		this.em = em;
	}
	
	public Vehicles createVehicles(String marque, String type, String options, int stock, double prix, String devise) {	
		Vehicles vehicles = new Vehicles(marque,type,options,stock,prix,devise);
		em.persist(vehicles);
		return vehicles;
	}
	
	
	@SuppressWarnings("unchecked")
	public Collection<Vehicles> findAllVehicles() {
		return em.createNamedQuery("Vehicles.findAll").getResultList();
	}

	@Override
	public Commande createCommande(Collection<Vehicles> myVehicles, String username) {
		// TODO Auto-generated method stub
		Commande myCommande = new Commande();
		myCommande.setUsername(username);
		myCommande.setContent(myVehicles);
		em.persist(myCommande);
		return myCommande;
	}
}
