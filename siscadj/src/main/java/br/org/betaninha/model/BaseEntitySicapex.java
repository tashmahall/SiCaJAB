package br.org.betaninha.model;

import java.io.Serializable;


public abstract class BaseEntitySicapex<ID_TYPE extends Serializable> implements IBaseEntitySicapex<ID_TYPE>{
	private static final long serialVersionUID = 1L;


	/**
	 * {@inheritDoc}
	 */
	public Object clone() throws CloneNotSupportedException {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return this;
		}
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.getId());
	}

	 /**
     * m�todo que implementa o hashcode do objeto.
     * 
     * @return int o valor do hashCode do objeto.
     */
    @Override
    public int hashCode() {
    	final int prime = 31;
    	int result = 1;
    	result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
    	return result;
    }

    /**
     * m�todo que implementa a compara��o entre dois objetos.
     * 
     * @param obj
     *            o objeto a ser comparado.
     * @return boolean retorna <b> true</b> se o objeto for igual, e
     *         <b>false</b> caso contr�rio.
     */
	@Override
    public boolean equals(Object obj) {
    	
		if (this == obj) {
		    return true;
		}
		
		if (obj == null) {
		    return false;
		}
		
		if (getClass() != obj.getClass()) {
		    return false;
		}
		
		@SuppressWarnings("rawtypes")
		BaseEntitySicapex other = (BaseEntitySicapex) obj;
		if (getId() == null) {
		    if (other.getId() != null) {
		    	return false;
		    }
		} else if (!getId().equals(other.getId())) {
		    return false;
		}
		return true;
    }

	
}
