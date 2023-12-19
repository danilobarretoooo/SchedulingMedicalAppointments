package dev.danilobarreto.SchedulingMedicalAppointments.Service;

import dev.danilobarreto.SchedulingMedicalAppointments.Model.Consulta;
import dev.danilobarreto.SchedulingMedicalAppointments.Repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {


    @Autowired
    private ConsultaRepository consultaRepository;

    public List<Consulta> listarConsultasPorPaciente(Long pacienteId) {
        return consultaRepository.findByPacienteId(pacienteId);
    }

    public List<Consulta> listarConsultasPorMedico(Long medicoId) {
        return consultaRepository.findByMedicoId(medicoId);
    }

    public Consulta agendarConsulta(Consulta consulta) {
        return consultaRepository.save(consulta);
    }
}
