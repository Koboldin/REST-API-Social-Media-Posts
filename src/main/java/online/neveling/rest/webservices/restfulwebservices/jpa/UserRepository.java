package online.neveling.rest.webservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;


import online.neveling.rest.webservices.restfulwebservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
