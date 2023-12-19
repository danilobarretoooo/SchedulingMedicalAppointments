package dev.danilobarreto.SchedulingMedicalAppointments.Controller;

import dev.danilobarreto.SchedulingMedicalAppointments.Model.Paciente;
import dev.danilobarreto.SchedulingMedicalAppointments.Repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/api/pacientes")
public class PacienteController {
    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping
    public String listarPacientes(Model model) {
        List<Paciente> pacientes = pacienteRepository.findAll();
        model.addAttribute("pacientes", pacientes);
        return "listarPacientes";
    }

    @GetMapping("/{id}")
    public String exibirDetalhesPaciente(@PathVariable Long id, Model model) {
        Paciente paciente = pacienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("ID de paciente inválido: " + id));
        model.addAttribute("paciente", paciente);
        return "detalhesPaciente";
    }
}
