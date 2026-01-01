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
@Schema(description = "PutResumeUserEntityRequest 对象")
public class PutResumeUserEntityRequest {

    @Schema(description = "简历用户ID")
    private Long resumeUserId;

    @Schema(description = "简历文件ID")
    private Long resumeFileId;

    @Schema(description = "账号实例ID，解析后自动创建回填")
    private Long accountInstanceId;

    @Schema(description = "用户实例ID，账号实名认证后回填")
    private Long userInstanceId;

    @Schema(description = "申请人邮箱,pdfbox解析")
    private String userEmail;

    @Schema(description = "手机号,pdfbox解析")
    private String userPhone;

    @Schema(description = "用户姓名")
    private String userName;

    @Schema(description = "性别[1:男，2:女]")
    private Integer userGender;

    @Schema(description = "年龄")
    private Integer userAge;

    @Schema(description = "工作年限")
    private Integer workingAge;

    @Schema(description = "出生日期")
    private LocalDateTime birthDate;

    @Schema(description = "头像")
    private String profilePhoto;

    @Schema(description = "自我评价")
    private String selfAppraise;

    @Schema(description = "亮点优势")
    private String advantage;

    @Schema(description = "存储技能相关的详细说明JSON")
    private String extension;

    @Schema(description = "用户简历版本")
    private Integer version;

}