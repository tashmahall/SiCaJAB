package br.org.betaninha.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Youth extends BaseEntity<Person> implements IBaseEntity<Person> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Person id;
	
	
	@Override
	public Person getId() {
		return id;
	}

	@Override
	public void setId(Person id) {
		this.id = id;
	}

}
