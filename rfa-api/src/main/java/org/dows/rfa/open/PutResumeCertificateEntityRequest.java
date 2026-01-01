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
@Schema(description = "PutResumeCertificateEntityRequest 对象")
public class PutResumeCertificateEntityRequest {

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

    @Schema(description = "证书描述（如 云计算架构师认证）")
    private String description;

    @Schema(description = "是否可用0-可用，1-不可用")
    private Boolean state;

}