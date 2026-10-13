package com.udea.banco.servicio;

import com.udea.banco.modelo.Cuenta;
import com.udea.banco.repositorio.CuentaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CuentaService {

    private final CuentaRepository repository;

    public CuentaService(CuentaRepository repository) {
        this.repository = repository;
    }

    public List<Cuenta> obtenerTodas() {
        return repository.findAll();
    }

    public Cuenta guardarCuenta(Cuenta cuenta) {
        return repository.save(cuenta);
    }
}