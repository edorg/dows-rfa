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
@Schema(description = "GetResumeSkillEntityResponse 对象")
public class GetResumeSkillEntityResponse {

    @Schema(description = "简历技能ID")
    private Long resumeSkillsId;

    @Schema(description = "简历文件ID")
    private Long resumeFileId;

    @Schema(description = "简历用户ID")
    private Long resumeUserId;

    @Schema(description = "技能名称")
    private String skill_name;

    @Schema(description = "熟练度ENUM ('beginner','intermediate','advanced','expert') ")
    private String proficiency;

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