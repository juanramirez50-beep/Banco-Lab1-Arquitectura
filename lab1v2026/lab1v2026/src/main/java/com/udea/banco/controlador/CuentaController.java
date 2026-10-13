package com.udea.banco.controlador;

import com.udea.banco.modelo.Cuenta;
import com.udea.banco.servicio.CuentaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cuentas")
@CrossOrigin(origins = "*")
public class CuentaController {

    private final CuentaService service;

    public CuentaController(CuentaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cuenta> listarCuentas() {
        return service.obtenerTodas();
    }

    @PostMapping
    public Cuenta crearCuenta(@RequestBody Cuenta cuenta) {
        return service.guardarCuenta(cuenta);
    }
}