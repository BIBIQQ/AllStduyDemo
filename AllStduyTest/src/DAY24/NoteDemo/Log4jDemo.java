package DAY24.NoteDemo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author FF
 * @date 2021/10/14
 * @TIME:16:44
 */
public class Log4jDemo {
    private static  final Logger log = LoggerFactory.getLogger(Log4jDemo.class);

    @Test
    public void test(){
        log.debug("debug日志");
        log.info("info日志");
        log.warn("warn日志");
        log.error("error日志");

    }
}
