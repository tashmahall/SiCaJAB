package br.org.betaninha.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class ObservationStatus  extends BaseEntity<Long> implements IBaseEntity<Long> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;

	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}
}
