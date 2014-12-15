package com.zhongli.server.basic;

import java.util.List;

public interface DAO <E extends DomainObject> {
	public E getByID(long id);
	public E getByID(String id);
	public List<E> getBy(String restrictAttributeName, Object value,String orderKeyAttributeName);
	public List<E> getAll(String orderKeyAttributeName);
	public void save(E object);
	public void delete(E object);
	public void deletByID(String id);
	public void deletByID(long id) ;
	public void deleteBy(String restrictAttributeName,Object value);
	public void closeSession();
}
