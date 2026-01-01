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
@Table("resume_user")
public class ResumeUserEntity extends CrudEntity<ResumeUserEntity> {

    @Schema(title = "简历用户ID")
    private Long resumeUserId;
    @Schema(title = "简历文件ID")
    private Long resumeFileId;
    @Schema(title = "账号实例ID，解析后自动创建回填")
    private Long accountInstanceId;
    @Schema(title = "用户实例ID，账号实名认证后回填")
    private Long userInstanceId;
    @Schema(title = "申请人邮箱,pdfbox解析")
    private String userEmail;
    @Schema(title = "手机号,pdfbox解析")
    private String userPhone;
    @Schema(title = "用户姓名")
    private String userName;
    @Schema(title = "性别[1:男，2:女]")
    private Integer userGender;
    @Schema(title = "年龄")
    private Integer userAge;
    @Schema(title = "工作年限")
    private Integer workingAge;
    @Schema(title = "出生日期")
    private LocalDateTime birthDate;
    @Schema(title = "头像")
    private String profilePhoto;
    @Schema(title = "自我评价")
    private String selfAppraise;
    @Schema(title = "亮点优势")
    private String advantage;
    @Schema(title = "存储技能相关的详细说明JSON")
    private String extension;
    @Schema(title = "用户简历版本")
    private Integer version;
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