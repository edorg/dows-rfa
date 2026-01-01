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
@Table("resume_store")
public class ResumeStoreEntity extends CrudEntity<ResumeStoreEntity> {

    @Schema(title = "简历存储ID")
    private Long resumeStoreId;
    @Schema(title = "简历文件ID")
    private Long resumeFileId;
    @Schema(title = "文件上传ID，oss回填")
    private Long ossFileId;
    @Schema(title = "详情ID")
    private Long ossDetailId;
    @Schema(title = "文件路径")
    private String filePath;
    @Schema(title = "文件全量路径")
    private String fileLink;
    @Schema(title = "文件扩展名")
    private String fileExt;
    @Schema(title = "文件md5")
    private String md5;
    @Schema(title = "文件大小")
    private Long fileSize;
    @Schema(title = "存储类型[local,oss,cos,qiniu...]")
    private String storeType;
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