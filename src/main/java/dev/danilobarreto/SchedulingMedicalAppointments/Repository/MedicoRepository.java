package dev.danilobarreto.SchedulingMedicalAppointments.Repository;

import dev.danilobarreto.SchedulingMedicalAppointments.Model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

}
