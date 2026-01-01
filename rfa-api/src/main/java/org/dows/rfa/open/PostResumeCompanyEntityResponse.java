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
@Schema(description = "PostResumeCompanyEntityResponse 对象")
public class PostResumeCompanyEntityResponse {

    @Schema(description = "简历公司ID")
    private Long resumeCompanyId;

}