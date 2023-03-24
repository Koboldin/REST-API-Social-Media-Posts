# rest_api_SMposts
First attempt to create a simple REST API using Spring Web, Spring JPA/ Hibernate, Spring Security. MySQL database (H2 optional). Thank you to 28minutes.com!

MySQL Database using Docker:

docker run --detach --env MYSQL_ROOT_PASSWORD=dummypassword --env MYSQL_USER=social-media-user --env MYSQL_PASSWORD=dummypassword --env MYSQL_DATABASE=social-media-database --name mysql --publish 3306:3306 mysql:8-oracle
