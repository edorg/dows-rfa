package org.dows.rfa.open;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Schema(description = "PostResumeFileEntityRequest 对象")
public class PostResumeFileEntityRequest {

    @Schema(description = "简历用户ID，解析简历后回填")
    private Long resumeUserId;

    @Schema(description = "组织岗位ID")
    private Long orgPositionId;

    @Schema(description = "岗位编号[P_6位数字]")
    private String positionNo;

    @Schema(description = "岗位名称[java高级工程师,架构师]")
    private String positionName;

    @Schema(description = "简历来源[boss|lagou|self...]")
    private String source;

    @Schema(description = "原始文件名")
    private String fileName;

    @Schema(description = "文件路径")
    private String filePath;

    @Schema(description = "批次号")
    private String batchNo;

}