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
@Table("resume_file")
public class ResumeFileEntity extends CrudEntity<ResumeFileEntity> {

    @Schema(title = "简历文件ID，先为每个简历文件保存生成id并对应响应文件{id:file}")
    private Long resumeFileId;
    @Schema(title = "简历用户ID，解析简历后回填")
    private Long resumeUserId;
    @Schema(title = "组织岗位ID")
    private Long orgPositionId;
    @Schema(title = "岗位编号[P_6位数字]")
    private String positionNo;
    @Schema(title = "岗位名称[java高级工程师,架构师]")
    private String positionName;
    @Schema(title = "简历来源[boss|lagou|self...]")
    private String source;
    @Schema(title = "原始文件名")
    private String fileName;
    @Schema(title = "批次号")
    private String batchNo;
    @Schema(title = "文件MD5")
    private String md5;
    @Schema(title = "状态[0:未上传成功,1:上传成功]")
    private Integer state;
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