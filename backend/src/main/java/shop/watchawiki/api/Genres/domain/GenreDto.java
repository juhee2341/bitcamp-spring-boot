package shop.watchawiki.api.Genres.domain;

import lombok.Data;

import javax.persistence.Column;

@Data
public class GenreDto {

    private long genreId;
    private String genrename;
}
