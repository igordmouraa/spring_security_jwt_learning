package br.com.igordmoura.springsecurity.Repositories;

import br.com.igordmoura.springsecurity.Entities.Tweet;
import br.com.igordmoura.springsecurity.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
