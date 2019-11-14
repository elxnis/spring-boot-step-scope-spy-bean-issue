package step.scope.spy.bean;

import step.scope.spy.bean.batch.MyItemWriter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class JobControllerIT {

    @Autowired
    TestRestTemplate template;

    @SpyBean
    MyItemWriter myItemWriter;

    @Test
    public void runJob() throws Exception {
        doCallRealMethod().doThrow(new RuntimeException("")).when(myItemWriter)
                .write(anyList());
        ResponseEntity<String> response = template.getForEntity("/",
                String.class);
        String body = response.getBody();
        assertThat(body).startsWith("JobExecution");
        assertThat(body).contains("FAILED");
    }


}
