package lesson30.dao.impl;

import lesson30.dao.CityDao;
import lesson30.model.City;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Slf4j
@Validated
@Repository
@RequiredArgsConstructor
public class CityDaoJpa implements CityDao {
    private final EntityManager em;

    @Override
    public List<City> findAll() {
        final Query selectAllQuery = em.createQuery("select a from City a");
        final List resultList = selectAllQuery.getResultList();
        return resultList;
    }

    @Override
    public Optional<City> getById(long cityPostCode) {
        return Optional.ofNullable(em.find(City.class, cityPostCode));
    }

    @Override
    public City save(@Valid City city) {
        if (city.getPostCode() == 0) {
            em.persist(city);
            return city;
        } else {
            return em.merge(city);
        }
    }

    @Override
    public void deleteById(long cityPostCode) {
        em.createQuery("delete from City a where a.postCode = :cityPostCode")
                .setParameter("cityPostCode", cityPostCode)
                .executeUpdate();
    }

    @Override
    public void delete(@Valid City city) {
        em.remove(city);
    }
}
