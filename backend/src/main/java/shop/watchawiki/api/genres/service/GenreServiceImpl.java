package shop.watchawiki.api.genres.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import shop.watchawiki.api.genres.domain.Genre;
import shop.watchawiki.api.genres.repository.GenreRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService{
    private final GenreRepository genreRepository;

//    public void add(){
//        List<Actor> List = actorRepository.findAll();
//    }

    @Override public List<Genre> findAll(){
        return genreRepository.findAll();
    }
    @Override public void save(Genre genre){
        genreRepository.save(genre);
    }
    @Override public int count(){
        return (int)genreRepository.count();
    }
    @Override public void deleteById(Long genreId){
        genreRepository.deleteById(genreId);
    }
    @Override public void existsById(Long genreId){
        genreRepository.existsById(genreId);
    }
    @Override public Optional<Genre> findById(Long genreId){
        return genreRepository.findById(genreId);
    }
    @Override public Genre getById(Long genreId){
        return genreRepository.getById(genreId);
    }

}
