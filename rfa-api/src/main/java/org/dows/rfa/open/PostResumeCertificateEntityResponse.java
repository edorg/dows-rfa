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
@Schema(description = "PostResumeCertificateEntityResponse 对象")
public class PostResumeCertificateEntityResponse {

    @Schema(description = "简历证书ID")
    private Long resumeCertificateId;

}