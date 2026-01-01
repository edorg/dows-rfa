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
@Table("resume_mail")
public class ResumeMailEntity extends CrudEntity<ResumeMailEntity> {

    @Schema(title = "简历邮件ID")
    private Long resumeMailId;
    @Schema(title = "组织实例ID")
    private Long orgInstanceId;
    @Schema(title = "组织邮箱ID")
    private Long orgEmailId;
    @Schema(title = "邮件发件人")
    private String sender;
    @Schema(title = "收件人")
    private String receivers;
    @Schema(title = "邮件主题")
    private String subject;
    @Schema(title = "邮件内容")
    private String content;
    @Schema(title = "附件文件名列表")
    private String attachment;
    @Schema(title = "状态(已读成功,已发送...)")
    private Integer state;
    @Schema(title = "读取时间")
    private LocalDateTime readedTime;
    @Schema(title = "发送时间")
    private LocalDateTime sendedTime;
    @Schema(title = "用途(0:收,1:发)")
    private Integer useType;
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