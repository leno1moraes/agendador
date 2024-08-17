package com.backend.leno.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.leno.scheduler.model.Record;
import org.springframework.stereotype.Repository;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
