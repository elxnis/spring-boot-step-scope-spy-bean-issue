package step.scope.spy.bean.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class MyItemWriter implements ItemWriter<Object> {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyItemWriter.class);

    @Override
    public void write(List<?> items) throws Exception {
        items.forEach(i -> LOGGER.info("writing {}", i));
    }
}
