package et.edu.askualalms.askualalms.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Admin {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;



        @NotBlank(message = "Email is mandatory.")
        @Column(nullable = false, unique = true)
        private String email;

        @NotBlank(message = "Password is mandatory.")
        @Column(nullable = false)
        private String password;
    }

