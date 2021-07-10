package shop.watchawiki.api.Genres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.watchawiki.api.Genres.domain.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre,Long> {
}
