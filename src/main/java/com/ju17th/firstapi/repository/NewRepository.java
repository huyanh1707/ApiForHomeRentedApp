package com.ju17th.firstapi.repository;

import com.ju17th.firstapi.entity.NewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewRepository extends JpaRepository<NewEntity, Long> {

}
