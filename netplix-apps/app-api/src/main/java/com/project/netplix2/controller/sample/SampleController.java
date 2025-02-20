package com.project.netplix2.controller.sample;

import com.project.netplix2.sample.SearchSampleUseCase;
import com.project.netplix2.sample.response.SampleResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SampleController {

    private final SearchSampleUseCase searchSampleUseCase;

    @GetMapping("/api/v1/sample")
    public SampleResponse getSample() {
        return searchSampleUseCase.getSample();
    }
}
