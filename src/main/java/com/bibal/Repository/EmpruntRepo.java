package com.bibal.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface EmpruntRepo extends JpaRepository<EmpruntRepo, Long>
{


}
