package com.fjgarciao.pipeconsole.persistence.beans;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaEntityInformationSupport;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.fjgarciao.pipeconsole.persistence.Entidad;

@org.springframework.stereotype.Repository
@Transactional(readOnly = true)
public class LocalSimpleJpaRepository<T extends Entidad<ID>, ID extends Serializable>
		extends SimpleJpaRepository<T, ID>
		implements LocalJpaRepository <T, ID> {

	private final JpaEntityInformation<T, ?> entityInformation;
	private final EntityManager em;

	/**
	 * Creates a new {@link LocalSimpleJpaRepository} to manage objects of the given {@link JpaEntityInformation}.
	 *
	 * @param entityInformation
	 * @param entityManager
	 */
	public LocalSimpleJpaRepository(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);

		this.entityInformation = entityInformation;
		this.em = entityManager;
	}

	/**
	 * Creates a new {@link LocalSimpleJpaRepository} to manage objects of the given domain type.
	 *
	 * @param domainClass
	 * @param em
	 */
	public LocalSimpleJpaRepository(Class<T> domainClass, EntityManager em) {
		this(JpaEntityInformationSupport.getMetadata(domainClass, em), em);
	}

	@Override
	public T findReference(ID id) {
		return em.getReference(entityInformation.getJavaType(), id);
	}
}
