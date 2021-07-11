package shop.watchawiki.api.genres.service;

import shop.watchawiki.api.genres.domain.Genre;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface GenreService {
     void save(Genre genre);
     List<Genre> findAll();
     void existsById(Long genreId);
     int count();
     Optional<Genre> findById(Long genreId);
     Genre getById(Long genreId);
     void deleteById(Long genreId);

}
