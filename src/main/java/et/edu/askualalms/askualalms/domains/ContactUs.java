
package et.edu.askualalms.askualalms.domains;

        import lombok.Data;
        import javax.persistence.*;
        import javax.validation.constraints.NotBlank;
        import javax.validation.constraints.Size;


@Data
@Entity
public class ContactUs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Long id;

    @NotBlank(message = "Course Full Name is mandatory.")
    @Column(nullable = false)
    @Size(max =45)
    private String courseName;

    @NotBlank(message = "email")
    @Column(nullable = false)
    @Size(max =15)
    private String creditHr;

    @NotBlank(message = "Course description  is mandatory.")
    @Column(nullable = false)
    @Size(max =300)
    private String courseDescription;

}



