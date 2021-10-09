package et.edu.askualalms.askualalms.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TeacherAccount {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY  )
        private Long id;

        @NotBlank(message = "first name is mandatory.")
        @Column(nullable = false)
        @Size(max =15)
        private String firstName;

        @NotBlank(message = "middle name is mandatory.")
        @Column(nullable = false)
        @Size(max =15)
        private String middleName;

        @NotBlank(message = "last name is mandatory.")
        @Column(nullable = false)
        @Size(max = 15)
        private String lastName;

        @NotBlank(message = "email is mandatory.")
        @Column(nullable = false, unique = true)
        private String email;

        @NotBlank(message = "department is mandatory.")
        @Column(nullable = false)
        private String department;

         @NotBlank(message = "department is mandatory.")
         @Column(nullable = false)
         private String experience;

        @NotBlank(message = "department is mandatory.")
        @Column(nullable = false)
        private String certification;


        @NotBlank(message = "phone number is mandatory.")
        @Column(nullable = false, unique = true)
        @Size(max = 20)
        private String phoneNumber;

       @NotNull(message = "Dob is mandatory.")
        @Column(nullable = false)
        //@Temporal(TemporalType.DATE)
        private LocalDate dateOfBirth;


        @NotNull(message = "password is mandatory.")
        @Column(nullable = false)
        private Integer password;

        private Boolean isVerified = Boolean.FALSE;
}


