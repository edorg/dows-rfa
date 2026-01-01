package org.dows.rfa.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.dows.rade.crud.CrudEntity;

import java.time.LocalDateTime;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@Table("resume_skill")
public class ResumeSkillEntity extends CrudEntity<ResumeSkillEntity> {

    @Schema(title = "简历技能ID")
    private Long resumeSkillsId;
    @Schema(title = "简历文件ID")
    private Long resumeFileId;
    @Schema(title = "简历用户ID")
    private Long resumeUserId;
    @Schema(title = "技能名称")
    private String skillName;
    @Schema(title = "熟练度ENUM ('beginner','intermediate','advanced','expert') ")
    private String proficiency;
    @Schema(title = "版本号")
    private Integer revision;
    @Schema(title = "应用id")
    private String appId;
    @Schema(title = "时间戳")
    private LocalDateTime createTime;
    @Schema(title = "更新时间")
    private LocalDateTime updateTime;
    @Schema(title = "删除时间")
    private LocalDateTime deleteTime;
    @Schema(title = "创建者ID")
    private Long createId;
    @Schema(title = "更新者ID")
    private Long updateId;
}