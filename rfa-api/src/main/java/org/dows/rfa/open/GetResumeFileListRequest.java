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
@Schema(description = "GetResumeFileListRequest 对象")
public class GetResumeFileListRequest {

    @Schema(description = "岗位名称[java高级工程师,架构师]")
    private String positionName;

    @Schema(description = "岗位编号[P_6位数字]")
    private String positionNo;

    @Schema(description = "简历来源[boss|lagou|self...]")
    private String source;

    @Schema(description = "批次号")
    private String batchNo;

    @Schema(description = "开始时间")
    private LocalDateTime startTime;

    @Schema(description = "结束时间")
    private LocalDateTime endTime;

}