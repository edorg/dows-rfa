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
@Table("resume_certificate")
public class ResumeCertificateEntity extends CrudEntity<ResumeCertificateEntity> {

    @Schema(title = "简历证书ID")
    private Long resumeCertificateId;
    @Schema(title = "简历文件ID")
    private Long resumeFileId;
    @Schema(title = "简历用户ID")
    private Long resumeUserId;
    @Schema(title = "证书名称")
    private String certificateName;
    @Schema(title = "证书颁发机构")
    private String issuer;
    @Schema(title = "证书获取时间")
    private String issueDate;
    @Schema(title = "证书过期时间")
    private String expireDate;
    @Schema(title = "证书验证链接")
    private String certificateUrl;
    @Schema(title = "证书描述（如 "云计算架构师认证"）")
    private String description;
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