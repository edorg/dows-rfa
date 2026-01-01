package org.dows.rfa;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 邮箱配置实体类
 * 对应数据库中邮箱相关配置字段的映射
 */
@Data
public class EmailConfig {


    // 读取配置
    //private ReadSetting readSetting;

    /**
     * 邮箱服务器列表
     */
    private List<ServerEndpoint> serverEndpoints = new ArrayList<>();


}