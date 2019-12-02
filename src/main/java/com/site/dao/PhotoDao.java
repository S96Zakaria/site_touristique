package com.site.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.site.module.Photo;
@Repository

public interface PhotoDao extends JpaRepository<Photo, Long>{

}
