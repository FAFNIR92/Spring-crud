package com.example.Clinica.Services;

import com.example.Clinica.Model.Cita;
import com.example.Clinica.Model.Medico;
import com.example.Clinica.Model.Paciente;
import com.example.Clinica.Repository.CitaRepository;
import com.example.Clinica.Repository.MedicoRepository;
import com.example.Clinica.Repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class CitaService {
    @Autowired
    CitaRepository citaRepository;
    MedicoRepository medicoRepository;
    PacienteRepository ipacienteRepository;

    public ArrayList<Cita> getAllCitas() {
        return (ArrayList<Cita>) citaRepository.findAll();
    }

    public Cita createCita(Cita cita) {
        return citaRepository.save(cita);
    }
    public Optional<Cita> getCitaById(long id) {
        return citaRepository.findById(id);
    }

    public Cita updateCita(Cita request, Long id) {
        Cita citaOptional = citaRepository.findById(id).get();

        citaOptional.setMedico(request.getMedico());
        citaOptional.setPaciente(request.getPaciente());
        citaOptional.setFecha(request.getFecha());

        return citaRepository.save(citaOptional);

    }

    public boolean deleteCita(long id) {
        try {
            citaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}