package com.project.netplix2.sample;

import com.project.netplix2.sample.response.SamplePortResponse;
import org.springframework.stereotype.Repository;

@Repository
public class SampleHttpAdapter implements SamplePort {
    @Override
    public SamplePortResponse getSample() {
        return new SamplePortResponse("Hello world");
    }
}
