package dev.danilobarreto.SchedulingMedicalAppointments.Repository;

import dev.danilobarreto.SchedulingMedicalAppointments.Model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    List<Consulta> findByPacienteId(Long pacienteId);
    List<Consulta> findByMedicoId(Long medicoId);
}
