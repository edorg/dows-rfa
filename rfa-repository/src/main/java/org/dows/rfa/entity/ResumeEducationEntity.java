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
@Table("resume_education")
public class ResumeEducationEntity extends CrudEntity<ResumeEducationEntity> {

    @Schema(title = "简历教育ID")
    private Long resumeEducationId;
    @Schema(title = "简历文件ID")
    private Long resumeFileId;
    @Schema(title = "简历用户ID")
    private Long resumeUserId;
    @Schema(title = "学历(高中")
    private String degree;
    @Schema(title = "学校名称")
    private String school;
    @Schema(title = "专业(计算机...)")
    private String major;
    @Schema(title = "开始时间")
    private String startTime;
    @Schema(title = "结束时间")
    private String endTime;
    @Schema(title = "是否可用0-可用，1-不可用")
    private Boolean state;
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