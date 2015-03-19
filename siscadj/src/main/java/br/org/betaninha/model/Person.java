package br.org.betaninha.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="PERSON",schema="IGREJA_DB")
@Entity
public class Person extends BaseEntity<Long> implements IBaseEntity<Long> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="PERSON_ID")
	private Long id;
	
	private String name;
	
	private String motherName;
	
	private String fatherName;
	
	private Date conversionDate;
	
	private Date birthDate;
	
	private Date startBetaninhaDate;
	
	private Date exitBetaninhaDate;
	
	private Boolean baptized;
	
	private Boolean divorcedParents;
	
	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

}
