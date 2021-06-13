package org.isj.eats_isj.webapp.repository;

import org.isj.eats_isj.webapp.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}