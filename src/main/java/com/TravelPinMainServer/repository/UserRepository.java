package com.TravelPinMainServer.repository;

import com.TravelPinMainServer.domain.entity.User;
import com.TravelPinMainServer.exception.AlreadyJoinedEmailException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class UserRepository {

    @PersistenceContext
    private final EntityManager em;

    public Long joinUser(User user) throws AlreadyJoinedEmailException {
        if(hasUserEmail(user.getEmail())) throw new AlreadyJoinedEmailException();
        em.persist(user);
        return em.find(User.class, user.getId()).getId();
    }


    public boolean hasUserEmail(String email){
        List<User> list = em.createQuery("select u from User u where u.email=:email", User.class)
                .setParameter("email", email)
                .getResultList();

        if(list.size() >= 1) return true;
        else return false;
    }
}
