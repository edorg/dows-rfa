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
@Schema(description = "PostResumeFileEntityResponse 对象")
public class PostResumeFileEntityResponse {

    @Schema(description = "简历文件ID，先为每个简历文件保存生成id并对应响应文件{id:file}")
    private Long resumeFileId;

}