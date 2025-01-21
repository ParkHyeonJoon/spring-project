package com.project.netplix2.movie;

public interface TmdbMoviePort {
    TmdbPageableMovies fetchPageable(int page);
}
