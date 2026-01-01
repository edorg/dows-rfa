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
@Schema(description = "PutResumeStoreEntityRequest 对象")
public class PutResumeStoreEntityRequest {

    @Schema(description = "简历存储ID")
    private Long resumeOssId;

    @Schema(description = "简历文件ID")
    private Long resumeFileId;

    @Schema(description = "文件上传ID，oss回填")
    private Long ossFileId;

    @Schema(description = "详情ID")
    private Long ossDetailId;

    @Schema(description = "触发器（UPLOAD上传、OTT解析）")
    private String trigger;

    @Schema(description = "文件路径")
    private String filePath;

    @Schema(description = "文件全量路径")
    private String fileLink;

    @Schema(description = "文件扩展名")
    private String fileExt;

    @Schema(description = "文件md5")
    private String md5;

    @Schema(description = "文件大小")
    private Long fileSize;

    @Schema(description = "存储类型[local,oss,cos,qiniu...]")
    private String storeType;

}