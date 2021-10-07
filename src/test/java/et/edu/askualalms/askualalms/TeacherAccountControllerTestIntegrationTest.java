package et.edu.askualalms.askualalms;


import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase
@AutoConfigureMockMvc


public class TeacherAccountControllerTestIntegrationTest {
    private final String TEACHERACCOUNT_ENDPOINT = " api/teacherAccount/create";
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCreateTeacherAccountWithValidInformation() throws Exception {
        String payload = "{\n" +
                "  \"firstName\": \"jos\",\n" +
                "  \"middleName\": \"Alemayehu\",\n" +
                "  \"lastName\": \"haile\",\n" +
                "  \"email\": \"al@jgmma.com\",\n" +
                "  \"phoneNumber\": \"803093333\",\n" +
                "  \"password\": 8880,\n" +
                "  \"department\": \"computing\",\n" +
                "  \"dateOfBirth\": \"1998-01-10\"\n" +
                "}";

        mockMvc.perform(

                        post("/api/teacherAccount/create")
                                .contentType("application/json")
                                .content(payload)
                )
                .andDo(print())
                .andExpect(status().is(200));
               // .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE));


}
    @Ignore
    public void sadPath() throws Exception {
        //private final String TEACHERACCOUNT_ENDPOINT = " api/teacherAccount/create";

        String payload = "{\n" +
                "  \"firstName\": \"jos\",\n" +
                "  \"middleName\": \"Alemayehu\",\n" +
                "  \"lastName\": \"haile\",\n" +
                "  \"email\": \"al@jgmma.com\",\n" +

                "}";


        mockMvc.perform(
                        post("/api/teacherAccount/create")
                                .contentType("application/json")
                                .content(payload)
                )
                .andDo(print())
                .andExpect(status().isOk());
               // .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE));

    }}


//}
