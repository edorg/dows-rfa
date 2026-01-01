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
@Schema(description = "PutResumeApplicaionEntityRequest 对象")
public class PutResumeApplicaionEntityRequest {

    @Schema(description = "简历申请ID")
    private Long resumeApplicationId;

    @Schema(description = "简历文件ID")
    private Long resumeFileId;

    @Schema(description = "简历用户ID")
    private Long resumeUserId;

    @Schema(description = "组织实例ID")
    private Long orgInstanceId;

    @Schema(description = "组织岗位ID")
    private Long orgPositionId;

    @Schema(description = "岗位编号[P_6位数字]")
    private String positionNo;

    @Schema(description = "岗位名称[java高级工程师,架构师]")
    private String positionName;

    @Schema(description = "所在地")
    private String location;

    @Schema(description = "期望薪资")
    private String expectedSalary;

    @Schema(description = "到岗时间")
    private LocalDateTime dutyTime;

}