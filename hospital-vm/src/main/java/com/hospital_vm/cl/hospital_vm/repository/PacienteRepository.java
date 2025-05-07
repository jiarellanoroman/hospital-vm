package com.hospital_vm.cl.hospital_vm.repository;

import com.hospital_vm.cl.hospital_vm.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    List<Paciente> findByApellidos(String apellidos);

    Paciente findByCorreo(String correo);

    List<Paciente> findByNombresandApellidos(String nombres, String apellidos);

    
}
