package com.hospital_vm.cl.hospital_vm.repository;

import com.hospital_vm.cl.hospital_vm.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    List<Paciente> findByApellidos(String apellidos);

    Paciente findByCorreo(Integer id);

    List<Paciente> findByNombresAndApellidos(String nombres, String apellidos); 

    void deleteById(Integer id);
}
