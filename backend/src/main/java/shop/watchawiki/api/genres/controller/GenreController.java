package shop.watchawiki.api.genres.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import shop.watchawiki.api.genres.domain.Genre;
import shop.watchawiki.api.genres.service.GenreService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/genres")
public class GenreController {
    private final GenreService genreService;
    @PostMapping("")
    public void save(@RequestBody Genre genre) {
        genreService.save(genre);
    }
    @GetMapping("")
    public List<Genre> findAll() {
        return genreService.findAll();
    }
    @GetMapping("/exists/{genre_id}")
    public void existsById(@RequestParam Long genreId) {
        genreService.existsById(genreId);
    }
    @GetMapping("/count")
    public int count() {
        return genreService.count();
    }
    @GetMapping("/find/{genreId}")
    public Optional<Genre> findById(@RequestParam Long genreId) {
        return genreService.findById(genreId);
    }
    @GetMapping("/{genreId}")
    public Genre getById(@RequestParam Long genreId) {
        return genreService.getById(genreId);
    }
    @DeleteMapping("/{genreId}")
    public void deleteById(@RequestParam Long genreId) {
        genreService.deleteById(genreId);
    }

}
