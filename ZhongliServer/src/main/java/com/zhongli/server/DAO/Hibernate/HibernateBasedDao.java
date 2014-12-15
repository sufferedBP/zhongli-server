package com.zhongli.server.DAO.Hibernate;


import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.zhongli.server.basic.DAO;
import com.zhongli.server.basic.BasicGeniericDao;
import com.zhongli.server.basic.DomainObject;

@SuppressWarnings("unchecked")
public class HibernateBasedDao<E extends DomainObject> extends BasicGeniericDao<E> implements DAO <E> {
	protected SessionFactory sessionFactory;
	protected Class<E> domainClass = (Class<E>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public E getByID(long id) {
		return (E) getSession().get(domainClass, id);
	}

	public E getByID(String id) {
		return (E) getSession().get(domainClass, id);
	}
	
	public List<E> getBy(String restrictAttributeName, Object value,String orderKeyAttributeName){
		Query query= getSession().createQuery(buildQueryString (null,restrictAttributeName,orderKeyAttributeName));
		initQueryParams(query,value);
		return (List<E>)query.list();	
	}
	public List<E> getAll(String orderKeyAttributeName){
		Query query= getSession().createQuery(buildQueryString (null,null,orderKeyAttributeName));
		return (List<E>)query.list();
	}

	public void save(E object) {
		getSession().saveOrUpdate(object);
	}

	public void delete(E object) {
		getSession().delete(object);
	}
	
	public void deletByID(String id) {
		delete((E) getSession().load(domainClass, id));
	}

	public void deletByID(long id) {
		delete((E) getSession().load(domainClass, id));
	}
	public void deleteBy(String restrictAttributeName,Object value)
	{
		Query query= getSession().createQuery(buildQueryString ("delete",restrictAttributeName,null));
		initQueryParams(query,value);
	}
	public void closeSession() {
		sessionFactory.getCurrentSession().getTransaction().commit();
	}


	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	protected String buildQueryString(String operation, String restrictAttributeName, String orderKeyAttributeName ){
		String resualt="";
		if (operation!=null)
			resualt=operation;
		resualt=resualt+" from "+domainClass.getCanonicalName();
		if(restrictAttributeName!=null)
			resualt=resualt+" where "+restrictAttributeName+"=?";
		if(orderKeyAttributeName!=null&&operation==null)
			resualt=resualt+" order by "+orderKeyAttributeName;
		return resualt;
	}
	protected void initQueryParams(Query query,Object... param){
		if(param !=null && param.length>0)
			for(int i=0;i<param.length;i++)
				query.setParameter(i, param[i]);
	}
}
