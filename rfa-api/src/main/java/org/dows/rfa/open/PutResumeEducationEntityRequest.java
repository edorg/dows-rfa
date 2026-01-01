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
@Schema(description = "PutResumeEducationEntityRequest 对象")
public class PutResumeEducationEntityRequest {

    @Schema(description = "简历教育ID")
    private Long resumeEducationId;

    @Schema(description = "简历文件ID")
    private Long resumeFileId;

    @Schema(description = "简历用户ID")
    private Long resumeUserId;

    @Schema(description = "学历(高中")
    private String degree;

    @Schema(description = "学校名称")
    private String school;

    @Schema(description = "专业(计算机...)")
    private String major;

    @Schema(description = "开始时间")
    private String startTime;

    @Schema(description = "结束时间")
    private String endTime;

    @Schema(description = "是否可用0-可用，1-不可用")
    private Boolean state;

}