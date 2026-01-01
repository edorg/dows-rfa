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
@Schema(description = "GetResumeCertificateListResponse 对象")
public class GetResumeCertificateListResponse {

    @Schema(description = "简历证书ID")
    private Long resumeCertificateId;

    @Schema(description = "简历文件ID")
    private Long resumeFileId;

    @Schema(description = "简历用户ID")
    private Long resumeUserId;

    @Schema(description = "证书名称")
    private String certificateName;

    @Schema(description = "证书颁发机构")
    private String issuer;

    @Schema(description = "证书获取时间")
    private String issue_date;

    @Schema(description = "证书过期时间")
    private String expire_date;

    @Schema(description = "证书验证链接")
    private String certificate_url;

    @Schema(description = "证书描述（如 "云计算架构师认证"）")
    private String description;

    @Schema(description = "是否可用0-可用，1-不可用")
    private Boolean state;

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