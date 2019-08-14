package example.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface dvdrentalRepository  {

    String display1 = "select a.actor_id,a.first_name||''||a.last_name as full_name,b.film_id \n" +
            "from actor a\n" +
            "join film_actor b on a.actor_id = b.actor_id\n" ;
}
