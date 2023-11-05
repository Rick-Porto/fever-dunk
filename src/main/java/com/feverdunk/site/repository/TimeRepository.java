package com.feverdunk.site.repository;

import com.feverdunk.site.models.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface TimeRepository extends JpaRepository<Time, Long> {
}
