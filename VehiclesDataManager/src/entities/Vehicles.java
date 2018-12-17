package entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Vehicles
 *
 */
@NamedQueries({
	@NamedQuery(name="Vehicles.findAll",
				query="SELECT e FROM Vehicles e"),
	@NamedQuery(name="Vehicles.findByPrimaryKey",
				query="SELECT e FROM Vehicles e WHERE e.id = :id")
	})

@Entity
@Table(name="Vehicles")
public class Vehicles implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String marque;
	
	private String type;
	
	private String options;
	
	private int stock;
	
	private double prix;
	
	private String devise;
	
	
	private static final long serialVersionUID = 1L;

	public Vehicles() {
		super();
	}
	
	public Vehicles(String marque, String type, String options, int stock, double prix, String devise) {
		super();
		setMarque(marque);
		setType(type);
		setOptions(options);
		setStock(stock);
		setPrix(prix);
		setDevise(devise);
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getDevise() {
		return devise;
	}

	public void setDevise(String devise) {
		this.devise = devise;
	}
   
}
