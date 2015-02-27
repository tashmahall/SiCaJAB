package br.org.betaninha.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Observation extends BaseEntity<Long> implements IBaseEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	
	private ObservationKind observationKind;
	
	private ObservationStatus obserbationStatus;
	
	private Person observedPerson;
	
	private Conseulor conseulor;
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub

	}

}
