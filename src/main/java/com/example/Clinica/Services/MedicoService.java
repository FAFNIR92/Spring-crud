package com.example.Clinica.Services;

import com.example.Clinica.Model.Medico;
import com.example.Clinica.Repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class MedicoService {
    @Autowired
    MedicoRepository medicoRepository;

    public ArrayList<Medico> getAllMedicos() {
        return (ArrayList<Medico>) medicoRepository.findAll();
    }

    public Medico saveMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    public Optional<Medico> getMedicoById(long id) {
        return medicoRepository.findById(id);
    }

    public Medico updateMedico(Medico request, Long id) {
        Medico medicoOptional = medicoRepository.findById(id).get();

        medicoOptional.setNombre(request.getNombre());
        medicoOptional.setEspecialidad(request.getEspecialidad());

        return medicoRepository.save(medicoOptional);
    }

    public boolean deleteMedico(long id) {
        try {
            medicoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}