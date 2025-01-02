package com.example.journalservice.DAO;

import com.example.journalservice.Model.Condition;
import java.util.*;
import com.example.journalservice.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConditionRepository extends JpaRepository<Condition, Long>{
    List<Condition> findByUser(User user);
}
