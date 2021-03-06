package services;

import java.util.Collection;
import java.util.List;

import javax.ejb.Remote;

import entities.Commande;
import entities.Vehicles;

@Remote
public interface VehiclesManager {
	public Vehicles createVehicles(String marque, String type, String options, int stock, double prix, String devise);
	public Collection<Vehicles> findAllVehicles();
	public Commande createCommande(Collection<Vehicles> myVehicle, String username);
}
