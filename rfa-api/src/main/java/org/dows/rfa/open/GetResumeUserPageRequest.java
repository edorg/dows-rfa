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
@Schema(description = "GetResumeUserPageRequest 对象")
public class GetResumeUserPageRequest {

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

    @Schema(description = "开始时间")
    private LocalDateTime startTime;

    @Schema(description = "结束时间")
    private LocalDateTime endTime;

}