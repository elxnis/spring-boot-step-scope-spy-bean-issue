package step.scope.spy.bean.config;

import step.scope.spy.bean.batch.MyItemReader;
import step.scope.spy.bean.batch.MyItemWriter;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

    private final JobBuilderFactory jobBuilderFactory;

    private final StepBuilderFactory stepBuilderFactory;

    public BatchConfig(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory) {
        this.jobBuilderFactory = jobBuilderFactory;
        this.stepBuilderFactory = stepBuilderFactory;
    }

    @Bean
    @StepScope
    public ItemStreamReader<Object> reader() {
        return new MyItemReader(Arrays.<Object>asList("a", "b", "c").iterator());
    }

    @Bean(destroyMethod = "")
    @StepScope
    public MyItemWriter writer() {
        return new MyItemWriter();
    }

    @Bean
    public Job myJob(Step myStep) {
        return jobBuilderFactory.get("myJob")
                .flow(myStep)
                .end()
                .build();
    }

    @Bean
    public Step myStep(ItemStreamReader<Object> reader, ItemWriter<Object> writer) {
        return stepBuilderFactory.get("myStep")
                .chunk(2)
                .reader(reader)
                .writer(writer)
                .build();
    }

}
