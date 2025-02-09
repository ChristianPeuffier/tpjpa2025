package DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jpa.EntityManagerHelper;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractJpaDao<k, T extends Serializable> implements IGenericDao<k, T> {
    protected EntityManager entityManager;
    protected Class<T> clazz;

    public AbstractJpaDao(Class<T> clazz) {
        this.entityManager = EntityManagerHelper.getEntityManager();
        this.clazz = clazz;
    }

    @Override
    public T findOne(k id) {
        return entityManager.find(clazz, id);
    }

    public List<T> findAll() {
        return entityManager.createQuery("select e from " + clazz.getName() + "as e", clazz).getResultList();
    }

    public void create(T entity) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(entity);
        tx.commit();
    }

    public T update(T entity) {
        EntityTransaction tx = this.entityManager.getTransaction();
        tx.begin();
        T res = entityManager.merge(entity);
        tx.commit();
        return res;
    }

    public void delete(T entity) {
        EntityTransaction tx = this.entityManager.getTransaction();
        tx.begin();
        entityManager.remove(entity);
        tx.commit();
    }

    public void deleteById(k entityId) {
        T entity = findOne(entityId);
        delete(entity);
    }

}
