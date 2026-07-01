package Ant0_n10.todolist.models;

import Ant0_n10.todolist.enumerations.StatusTask;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TB_task")
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String description;

    @Enumerated(EnumType.STRING)
    private StatusTask status;
}
