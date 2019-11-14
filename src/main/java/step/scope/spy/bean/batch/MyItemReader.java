package step.scope.spy.bean.batch;

import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.support.AbstractItemStreamItemReader;

import java.util.Iterator;

public class MyItemReader extends AbstractItemStreamItemReader<Object> {

    private final Iterator<Object> objectIterator;

    public MyItemReader(Iterator<Object> objectIterator) {
        this.objectIterator = objectIterator;
    }

    @Override
    public Object read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        return objectIterator.hasNext() ? objectIterator.next() : null;
    }
}
