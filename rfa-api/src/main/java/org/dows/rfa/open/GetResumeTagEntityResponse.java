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
@Schema(description = "GetResumeTagEntityResponse 对象")
public class GetResumeTagEntityResponse {

    @Schema(description = "简历标签ID")
    private Long resumeTagValueId;

    @Schema(description = "简历文件ID")
    private Long resumeFileId;

    @Schema(description = "简历用户ID")
    private Long resumeUserd;

    @Schema(description = "标签名")
    private String tagName;

    @Schema(description = "code")
    private String tagCode;

    @Schema(description = "标签值")
    private String value;

    @Schema(description = "标签颜色")
    private String color;

    @Schema(description = "标签序号")
    private Integer seq;

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