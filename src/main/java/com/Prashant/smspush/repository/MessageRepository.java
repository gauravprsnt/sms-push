package com.Prashant.smspush.repository;

import com.Prashant.smspush.modal.SMS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<SMS,Long> {

}
