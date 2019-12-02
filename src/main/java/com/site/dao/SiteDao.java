package com.site.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.site.module.Site;
@Repository
public interface SiteDao extends JpaRepository<Site, Long>{

}
