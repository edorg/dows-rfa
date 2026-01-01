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
@Schema(description = "DeleteResumeTagEntityRequest 对象")
public class DeleteResumeTagEntityRequest {

    @Schema(description = "简历标签ID")
    private Long resumeTagValueId;

}