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
@Schema(description = "PutResumeSkillEntityRequest 对象")
public class PutResumeSkillEntityRequest {

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

}