package com.springboot.models.serviceimpl;

import com.springboot.models.entity.TipoServicio;
import com.springboot.models.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoServicioServiceImpl {

    @Autowired
    private TipoServicioRepository tipoServicioRepository;

    public List<TipoServicio> findAll() {
        return tipoServicioRepository.findAll();
    }

}
