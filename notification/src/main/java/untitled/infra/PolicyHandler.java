package untitled.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import untitled.config.kafka.KafkaProcessor;
import untitled.domain.*;

@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FileIndexed'"
    )
    public void wheneverFileIndexed_NotifyToUser(
        @Payload FileIndexed fileIndexed
    ) {
        FileIndexed event = fileIndexed;
        System.out.println(
            "\n\n##### listener NotifyToUser : " + fileIndexed + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='VideoFileProcessed'"
    )
    public void wheneverVideoFileProcessed_NotifyToUser(
        @Payload VideoFileProcessed videoFileProcessed
    ) {
        VideoFileProcessed event = videoFileProcessed;
        System.out.println(
            "\n\n##### listener NotifyToUser : " + videoFileProcessed + "\n\n"
        );
        // Sample Logic //

    }
}
