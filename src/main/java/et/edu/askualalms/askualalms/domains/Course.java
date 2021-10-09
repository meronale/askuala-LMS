package et.edu.askualalms.askualalms.domains;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Data
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Course name is mandatory.")
    @Column(nullable = false)
    @Size(max = 15)
    private String fullName;

    @NotBlank(message = "Creadithr is mandatory.")
    @Column(nullable = false)

    private String creadithr;

    @NotBlank(message = "payment ammount is mandatory.")
    @Column(nullable = false)
    private String payment;

    @NotBlank(message = "course description is mandatory.")
    @Column(nullable = false)
    private String description;

}



