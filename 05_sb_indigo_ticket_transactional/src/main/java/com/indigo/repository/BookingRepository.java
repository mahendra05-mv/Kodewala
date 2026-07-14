package com.indigo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indigo.entity.BookingEntity;


@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, Long>
{
 // List<BookingEntity> findByUserId(String userId);
}