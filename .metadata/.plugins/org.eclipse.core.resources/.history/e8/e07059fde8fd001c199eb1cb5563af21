package ClientDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity(name="clients")
@Table(name="clients")
public class Client {

	
	
		public Client() {
		
	}
		
		private long id;
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		
		private String cin;
		@Column(name="nom_client")
		private String nom;
		@Column(name="prenom_client")
		private String prenom;
		
		public Client(long id, String cin, String nom, String prenom) {
			super();
			this.id = id;
			this.cin = cin;
			this.nom = nom;
			this.prenom = prenom;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getCin() {
			return cin;
		}
		public void setCin(String cin) {
			this.cin = cin;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		
	}


