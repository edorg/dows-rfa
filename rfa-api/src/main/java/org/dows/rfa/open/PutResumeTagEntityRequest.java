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
@Schema(description = "PutResumeTagEntityRequest 对象")
public class PutResumeTagEntityRequest {

    @Schema(description = "简历标签ID")
    private Long resumeTagValueId;

    @Schema(description = "简历文件ID")
    private Long resumeFileId;

    @Schema(description = "简历用户ID")
    private Long resumeUserd;

    @Schema(description = "标签名")
    private String tagName;

    @Schema(description = "code")
    private String tagCode;

    @Schema(description = "标签值")
    private String value;

    @Schema(description = "标签颜色")
    private String color;

    @Schema(description = "标签序号")
    private Integer seq;

}