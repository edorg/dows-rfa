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
@Schema(description = "DeleteResumeUserEntityRequest 对象")
public class DeleteResumeUserEntityRequest {

    @Schema(description = "简历用户ID")
    private Long resumeUserId;

}