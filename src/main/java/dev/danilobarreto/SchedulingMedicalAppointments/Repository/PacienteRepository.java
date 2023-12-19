package dev.danilobarreto.SchedulingMedicalAppointments.Repository;

import dev.danilobarreto.SchedulingMedicalAppointments.Model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
