package org.dows.rfa;

import lombok.Data;

@Data
public class ServerEndpoint {

    /**
     * 邮箱通道（可选值：163/QQ/Outlook/126/Gmail/企业邮箱）
     * 数据库字段类型：varchar
     */
    private String channel;
    /**
     * 邮箱类型（0:个人，1:企业）
     * 数据库字段类型：integer
     */
    private Integer emailType;

    /**
     * 邮箱地址（示例格式：123@qq.com）
     * 数据库字段类型：varchar
     */
    private String emailAddress;

    /**
     * 加密授权码
     * 数据库字段类型：varchar
     */
    private String authCode;

    /**
     * 邮箱协议（可选值：IMAP/SMTP）
     * 数据库字段类型：varchar
     */
    private String protocol;

    /**
     * 服务器地址
     * 数据库字段类型：varchar
     */
    private String serverAddress;

    /**
     * 服务器端口
     * 数据库字段类型：varchar（若实际为数字类型，可修改为Integer）
     */
    private String serverPort;
}
