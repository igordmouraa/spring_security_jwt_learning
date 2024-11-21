package br.com.igordmoura.springsecurity.Repositories;

import br.com.igordmoura.springsecurity.Entities.Role;
import br.com.igordmoura.springsecurity.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
