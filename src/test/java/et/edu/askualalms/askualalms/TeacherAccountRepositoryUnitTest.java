package et.edu.askualalms.askualalms;

import et.edu.askualalms.askualalms.repositories.TeacherAccountRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase
public class TeacherAccountRepositoryUnitTest {
    @MockBean
    private TeacherAccountRepository teacherAccountRepository;

    @Before
    public void setup() {
        given(teacherAccountRepository.count()).willReturn(3L);

    }


    @Test
    public void countofAccount() {
        Long count = teacherAccountRepository.count();
        assertThat(count).isEqualTo(3L);


    }
}
