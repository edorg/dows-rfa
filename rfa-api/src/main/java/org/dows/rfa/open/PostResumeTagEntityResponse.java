package org.dows.rfa.open;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Schema(description = "PostResumeTagEntityResponse 对象")
public class PostResumeTagEntityResponse {

    @Schema(description = "简历标签ID")
    private Long resumeTagValueId;

}