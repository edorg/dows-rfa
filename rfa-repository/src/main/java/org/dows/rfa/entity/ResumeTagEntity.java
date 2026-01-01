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
@Table("resume_tag")
public class ResumeTagEntity extends CrudEntity<ResumeTagEntity> {

    @Schema(title = "简历标签ID")
    private Long resumeTagValueId;
    @Schema(title = "简历文件ID")
    private Long resumeFileId;
    @Schema(title = "简历用户ID")
    private Long resumeUserd;
    @Schema(title = "标签名")
    private String tagName;
    @Schema(title = "code")
    private String tagCode;
    @Schema(title = "标签值")
    private String value;
    @Schema(title = "标签颜色")
    private String color;
    @Schema(title = "标签序号")
    private Integer seq;
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