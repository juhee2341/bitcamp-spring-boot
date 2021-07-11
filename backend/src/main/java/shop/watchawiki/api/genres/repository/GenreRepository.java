package shop.watchawiki.api.genres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.watchawiki.api.genres.domain.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre,Long> {
}
