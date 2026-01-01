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
@Table("resume_application")
public class ResumeApplicationEntity extends CrudEntity<ResumeApplicationEntity> {

    @Schema(title = "简历申请ID")
    private Long resumeApplicationId;
    @Schema(title = "简历文件ID")
    private Long resumeFileId;
    @Schema(title = "简历用户ID")
    private Long resumeUserId;
    @Schema(title = "组织实例ID")
    private Long orgInstanceId;
    @Schema(title = "组织岗位ID")
    private Long orgPositionId;
    @Schema(title = "岗位编号[P_6位数字]")
    private String positionNo;
    @Schema(title = "岗位名称[java高级工程师,架构师]")
    private String positionName;
    @Schema(title = "所在地")
    private String location;
    @Schema(title = "期望薪资")
    private String expectedSalary;
    @Schema(title = "到岗时间")
    private LocalDateTime dutyTime;
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