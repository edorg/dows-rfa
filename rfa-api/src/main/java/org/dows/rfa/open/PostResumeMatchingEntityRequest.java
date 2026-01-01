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
@Schema(description = "PostResumeMatchingEntityRequest 对象")
public class PostResumeMatchingEntityRequest {

    @Schema(description = "简历文件ID")
    private Long resumeFileId;

    @Schema(description = "简历用户ID")
    private Long resumeUserId;

    @Schema(description = "简历申请ID")
    private Long resumeApplicationId;

    @Schema(description = "组织实例ID")
    private Long orgInstanceId;

    @Schema(description = "组织树ID")
    private Long orgTreeId;

    @Schema(description = "组织岗位ID")
    private Long orgPositionId;

    @Schema(description = "账号实例ID")
    private Long accountInstanceId;

    @Schema(description = "用户实例ID")
    private Long userInstanceId;

    @Schema(description = "推荐理由")
    private String featureJson;

    @Schema(description = "匹配度")
    private Integer matchingScore;

}