package com.goldenway.repository;


import com.goldenway.dto.UserInfoDTO;
import com.goldenway.entities.user;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends JpaRepository<user, Long>, JpaSpecificationExecutor {


}
