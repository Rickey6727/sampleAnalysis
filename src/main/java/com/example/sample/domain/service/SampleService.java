package com.example.sample.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.domain.model.SampleEntity;
import com.example.sample.domain.repository.SampleRepository;

@Service
public class SampleService {

    @Autowired
    SampleRepository  sampleRepository;

    public List<Integer> getSample () {
        return sampleRepository.selectAll();
    }
}