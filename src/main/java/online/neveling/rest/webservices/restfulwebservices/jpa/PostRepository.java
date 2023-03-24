package online.neveling.rest.webservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;


import online.neveling.rest.webservices.restfulwebservices.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
