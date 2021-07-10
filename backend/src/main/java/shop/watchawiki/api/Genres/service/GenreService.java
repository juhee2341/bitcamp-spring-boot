package shop.watchawiki.api.Genres.service;

import shop.watchawiki.api.Genres.domain.Genre;

import java.util.List;
import java.util.Optional;

public class GenreService {
    void save(Genre genre);
    List<Genre> findAll();
    void existsById(long genreId);
    int count();
    Optional<Genre> findById(long genreId);
    Genre getById(long genreId);
    void deleteById(long genreId);
}
