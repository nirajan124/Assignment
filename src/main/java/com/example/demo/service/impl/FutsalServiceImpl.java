package com.example.demo.service.impl;

import com.example.demo.entity.Futsal;
import com.example.demo.pojo.FutsalPojo;
import com.example.demo.repository.FutsalRepository;
import com.example.demo.service.FutsalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
@RequiredArgsConstructor
public class FutsalServiceImpl implements FutsalService {

    private final FutsalRepository futsalRepository;


    @Override
    public List<Futsal> findAll() {
        return futsalRepository.findAll();
    }


  @Override
    public void saveData(FutsalPojo futsalPojo) {
        Futsal futsal = new Futsal();

        futsal.setId(futsalPojo.getId());
        futsal.setFutsal_name(futsalPojo.getFutsal_name());

        futsalRepository.save(futsal);


    }
    @Override
    public void deleteById(Integer id) {
        futsalRepository.deleteById(id);
    }

    @Override
    public Optional<Futsal> findById(Integer id) {
        return futsalRepository.findById(id);
    }

}    

