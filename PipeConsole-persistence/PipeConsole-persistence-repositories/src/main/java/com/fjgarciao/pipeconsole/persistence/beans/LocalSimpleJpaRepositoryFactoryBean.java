package com.fjgarciao.pipeconsole.persistence.beans;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

import com.fjgarciao.pipeconsole.persistence.Entidad;

public class LocalSimpleJpaRepositoryFactoryBean<Q extends JpaRepository<T, ID>, T extends Entidad<ID>, ID extends Serializable>
		extends JpaRepositoryFactoryBean<Q, T, ID> {

	/**
	 * Returns a {@link RepositoryFactorySupport}.
	 *
	 * @param entityManager
	 * @return
	 */
	protected RepositoryFactorySupport createRepositoryFactory(
			EntityManager entityManager) {
		return new LocalSimpleJpaRepositoryFactory<Q, T, ID>(entityManager);
	}

	private static class LocalSimpleJpaRepositoryFactory<Q extends JpaRepository<T, ID>, T extends Entidad<ID>, ID extends Serializable>
			extends JpaRepositoryFactory {

		private EntityManager entityManager;

		public LocalSimpleJpaRepositoryFactory(EntityManager entityManager) {
			super(entityManager);
			this.entityManager = entityManager;
		}

		@SuppressWarnings("unchecked")
		@Override
		protected JpaRepository<T, ID> getTargetRepository(
				RepositoryMetadata metadata, EntityManager entityManager) {
			JpaEntityInformation<T, Serializable> entityInformation = (JpaEntityInformation<T, Serializable>) getEntityInformation(metadata
					.getDomainClass());
			return new LocalSimpleJpaRepository<T, ID>(entityInformation,
					entityManager);
		}

		@Override
		protected Object getTargetRepository(RepositoryMetadata metadata) {
			return getTargetRepository(metadata, entityManager);
		}

		@Override
		protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {
			return LocalSimpleJpaRepository.class;
		}
	}
}