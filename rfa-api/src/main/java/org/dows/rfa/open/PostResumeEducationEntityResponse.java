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
@Schema(description = "PostResumeEducationEntityResponse 对象")
public class PostResumeEducationEntityResponse {

    @Schema(description = "简历教育ID")
    private Long resumeEducationId;

}