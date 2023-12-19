package dev.danilobarreto.SchedulingMedicalAppointments.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "consultas")
@Getter
@Setter
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Paciente paciente;

    @ManyToOne
    private Medico medico;

    private LocalDateTime dataConsulta;
}
