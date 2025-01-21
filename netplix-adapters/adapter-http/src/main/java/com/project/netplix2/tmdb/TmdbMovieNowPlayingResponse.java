package com.project.netplix2.tmdb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class TmdbMovieNowPlayingResponse {
    private TmdbDateResponse dates;
    private String page;

    @JsonProperty("total_pages")
    private int totalPages;

    @JsonProperty("total_results")
    private String totalResults;

    private List<TmdbMovieNowPlaying> results;

}
