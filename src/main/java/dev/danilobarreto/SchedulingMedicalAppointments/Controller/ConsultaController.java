package dev.danilobarreto.SchedulingMedicalAppointments.Controller;

import dev.danilobarreto.SchedulingMedicalAppointments.Model.Consulta;
import dev.danilobarreto.SchedulingMedicalAppointments.Service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/consultas")
public class ConsultaController {
    @Autowired
    private ConsultaService consultaService;

    @GetMapping("/paciente/{pacienteId}")
    public String listarConsultasPorPaciente(@PathVariable Long pacienteId, Model model) {
        List<Consulta> consultas = consultaService.listarConsultasPorPaciente(pacienteId);
        model.addAttribute("consultas", consultas);
        return "consultasPorPaciente";
    }

    @GetMapping("/medico/{medicoId}")
    public String listarConsultasPorMedico(@PathVariable Long medicoId, Model model) {
        List<Consulta> consultas = consultaService.listarConsultasPorMedico(medicoId);
        model.addAttribute("consultas", consultas);
        return "consultasPorMedico";
    }

    @PostMapping("/agendar")
    public String agendarConsulta(@ModelAttribute Consulta consulta) {
        consultaService.agendarConsulta(consulta);
        return "redirect:/";
    }
}
