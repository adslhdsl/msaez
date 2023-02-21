package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class VideoFileProcessed extends AbstractEvent {

    private Long id;
    private String url;
    private String fileKey;
}
