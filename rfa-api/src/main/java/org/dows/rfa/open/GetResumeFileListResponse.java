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
@Schema(description = "GetResumeFileListResponse 对象")
public class GetResumeFileListResponse {

    @Schema(description = "简历文件ID，先为每个简历文件保存生成id并对应响应文件{id:file}")
    private Long resumeFileId;

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

    @Schema(description = "批次号")
    private String batchNo;

    @Schema(description = "文件MD5")
    private String md5;

    @Schema(description = "状态[0:未上传成功,1:上传成功]")
    private Integer state;

    @Schema(description = "版本号")
    private Integer revision;

    @Schema(description = "应用id")
    private String app_id;

    @Schema(description = "时间戳")
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    private LocalDateTime updateTime;

    @Schema(description = "删除时间")
    private LocalDateTime deleteTime;

    @Schema(description = "创建者ID")
    private Long createId;

    @Schema(description = "更新者ID")
    private Long updateId;

}