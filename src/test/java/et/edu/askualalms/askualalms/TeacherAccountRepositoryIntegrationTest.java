package et.edu.askualalms.askualalms;

import et.edu.askualalms.askualalms.domains.TeacherAccount;
import et.edu.askualalms.askualalms.repositories.TeacherAccountRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase
public class TeacherAccountRepositoryIntegrationTest {


    @Autowired
    private TeacherAccountRepository teacherAccountRepository;


    @Test
    public void testTeacherAccountCreationinDB() {
        TeacherAccount teacherAccount= TeacherAccount.builder()
                .firstName("meron")
                .middleName("jos")
                .lastName("new")
                .department("Art&lit")
                .phoneNumber("12345678")
                .email("jos@meron")
                .certification("Cisco")
                .experience("2 year")
                .password(12546)
                .dateOfBirth(LocalDate.of(1995,1,1))
                .build();
        TeacherAccount savedTeacherAccount =teacherAccountRepository.save(teacherAccount);
        assertThat(savedTeacherAccount).isNotNull();
        assertThat(savedTeacherAccount.getId()).isEqualTo(1);
        assertThat(savedTeacherAccount.getFirstName()).isEqualTo("meron");
        assertThat(savedTeacherAccount.getFirstName()).isEqualTo(teacherAccount.getFirstName());


    }
}
