package dev.danilobarreto.SchedulingMedicalAppointments.Controller;

import dev.danilobarreto.SchedulingMedicalAppointments.Model.Medico;
import dev.danilobarreto.SchedulingMedicalAppointments.Repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository medicoRepository;

    @GetMapping
    public String listarMedicos(Model model) {
        List<Medico> medicos = medicoRepository.findAll();
        model.addAttribute("medicos", medicos);
        return "listarMedicos";
    }

    @GetMapping("/{id}")
    public String exibirDetalhesMedico(@PathVariable Long id, Model model) {
        Medico medico = medicoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("ID de médico inválido: " + id));
        model.addAttribute("medico", medico);
        return "detalhesMedico";
    }
}
