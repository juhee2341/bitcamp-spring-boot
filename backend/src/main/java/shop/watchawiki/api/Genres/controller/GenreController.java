package shop.watchawiki.api.Genres.controller;

import org.springframework.web.bind.annotation.*;
import shop.watchawiki.api.Genres.domain.Genre;
import shop.watchawiki.api.Genres.service.GenreService;

import java.util.List;

public class GenreController {
    private final GenreService seatService;

    @PostMapping("")
    public void save(@RequestBody Genre genre) {
        seatService.save(genre);
    }
    @GetMapping("")
    public List<Genre> findAll() {
        return seatService.findAll();
    }
    @GetMapping("/exists/{seatId}")
    public void existsById(@RequestParam long genreId) {
        seatService.existsById(genreId);
    }
    @GetMapping("/count")
    public int count() {
        return seatService.count();
    }
    @GetMapping("/find/{seatId}")
    public Optional<Seat> findById(@RequestParam long genreId) {
        return seatService.findById(genreId);
    }
    @GetMapping("/{seatId}")
    public Seat getById(@RequestParam long genreId) {
        return seatService.getById(genreId);
    }
    @DeleteMapping("/{seatId}")
    public void deleteById(@RequestParam long genreId) {
        seatService.deleteById(genreId);
    }
}
