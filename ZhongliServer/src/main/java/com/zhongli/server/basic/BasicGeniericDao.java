package com.zhongli.server.basic;

import java.util.List;

public abstract class BasicGeniericDao<E extends DomainObject> {
	public abstract E getByID(long id);
	public abstract E getByID(String id);
	public abstract List<E> getBy(String restrictAttributeName, Object value,String orderKeyAttributeName);
	public abstract List<E> getAll(String orderKeyAttributeName);
	public abstract void save(E object);
	public abstract void delete(E object);
	public abstract void deletByID(String id);
	public abstract void deletByID(long id) ;
	public abstract void deleteBy(String restrictAttributeName,Object value);

}
