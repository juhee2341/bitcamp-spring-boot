package shop.watchawiki.api.Genres.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.watchawiki.api.Genres.domain.Genre;
import shop.watchawiki.api.Genres.repository.GenreRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl {
    GenreRepository genreRepository;
    @Override public List<Genre> findAll(){
        return genreRepository.findAll();
    }
    @Override public void save(Genre genre){
        genreRepository.save(genre);
    }
    @Override public int count(){
        return (int)genreRepository.count();
    }
    @Override public void deleteById(long genreId){
        genreRepository.deleteById(genreId);
    }
    @Override public void existsById(long genreId){
        genreRepository.existsById(genreId);
    }
    @Override public Optional<Genre> findById(long genreId){
        return genreRepository.findById(genreId);
    }
    @Override public Genre getById(long genreId){
        return genreRepository.getById(genreId);
    }
}
