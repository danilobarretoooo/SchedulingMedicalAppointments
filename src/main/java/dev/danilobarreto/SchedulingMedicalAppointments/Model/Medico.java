package dev.danilobarreto.SchedulingMedicalAppointments.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "medicos")
@Getter
@Setter
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nome;
    private String especialidade;



}
