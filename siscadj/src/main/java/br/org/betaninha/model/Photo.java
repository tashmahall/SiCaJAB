package br.org.betaninha.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity
public class Photo extends BaseEntity<Long> implements IBaseEntity<Long>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	
	@ManyToOne
	@Column(name="PERSON_ID", nullable=false, insertable=true)
	@JoinColumn(name="PERSON_ID", referencedColumnName="ID", nullable=false )
	private Person person;
	
	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
