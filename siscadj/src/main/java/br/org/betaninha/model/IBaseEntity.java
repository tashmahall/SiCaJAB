package br.org.betaninha.model;

import java.io.Serializable;

public interface IBaseEntity<ID_TYPE extends Serializable> extends Serializable, Cloneable{
	public abstract ID_TYPE getId();
	public abstract void setId(ID_TYPE id);
}
