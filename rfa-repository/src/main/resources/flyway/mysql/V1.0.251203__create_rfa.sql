-- 若库不存在创建一个
CREATE DATABASE IF NOT EXISTS `rfa`;
USE `rfa`;

drop table if exists `resume_mail`;
CREATE TABLE IF NOT EXISTS `resume_mail`(
    `resume_mail_id` bigint(19) NOT NULL COMMENT '简历邮件ID',
    `org_instance_id` bigint(19) DEFAULT NULL COMMENT '组织实例ID',
    `org_email_id` bigint(19) DEFAULT NULL COMMENT '组织邮箱ID',
    `sender` varchar(64) DEFAULT NULL COMMENT '邮件发件人',
    `receivers` varchar(64) DEFAULT NULL COMMENT '收件人',
    `subject` varchar(64) DEFAULT NULL COMMENT '邮件主题',
    `content` varchar(64) DEFAULT NULL COMMENT '邮件内容',
    `attachment` varchar(64) DEFAULT NULL COMMENT '附件文件名列表',
    `state` integer(11) DEFAULT NULL COMMENT '状态(已读成功,已发送...)',
    `readed_time` datetime DEFAULT NULL COMMENT '读取时间',
    `sended_time` datetime DEFAULT NULL COMMENT '发送时间',
    `use_type` integer(11) DEFAULT NULL COMMENT '用途(0:收,1:发)',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`resume_mail_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `resume_config`;
CREATE TABLE IF NOT EXISTS `resume_config`(
    `resume_config_id` bigint(19) NOT NULL COMMENT '简历配置ID',
    `config_name` varchar(64) DEFAULT NULL COMMENT '配置名称',
    `config_json` varchar(64) DEFAULT NULL COMMENT '配置JSON',
    `state` tinyint(4) DEFAULT NULL COMMENT '状态',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`resume_config_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `resume_file`;
CREATE TABLE IF NOT EXISTS `resume_file`(
    `resume_file_id` bigint(19) NOT NULL COMMENT '简历文件ID，先为每个简历文件保存生成id并对应响应文件{id:file}',
    `resume_user_id` bigint(19) DEFAULT NULL COMMENT '简历用户ID，解析简历后回填',
    `org_position_id` bigint(19) DEFAULT NULL COMMENT '组织岗位ID',
    `position_no` varchar(64) DEFAULT NULL COMMENT '岗位编号[P_6位数字]',
    `position_name` varchar(64) DEFAULT NULL COMMENT '岗位名称[java高级工程师,架构师]',
    `source` varchar(64) DEFAULT NULL COMMENT '简历来源[boss|lagou|self...]',
    `file_name` varchar(64) DEFAULT NULL COMMENT '原始文件名',
    `batch_no` varchar(64) DEFAULT NULL COMMENT '批次号',
    `md5` varchar(64) DEFAULT NULL COMMENT '文件MD5',
    `state` integer(11) DEFAULT NULL COMMENT '状态[0:未上传成功,1:上传成功]',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`resume_file_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `resume_store`;
CREATE TABLE IF NOT EXISTS `resume_store`(
    `resume_store_id` bigint(19) NOT NULL COMMENT '简历存储ID',
    `resume_file_id` bigint(19) DEFAULT NULL COMMENT '简历文件ID',
    `oss_file_id` bigint(19) DEFAULT NULL COMMENT '文件上传ID，oss回填',
    `oss_detail_id` bigint(19) DEFAULT NULL COMMENT '详情ID',
    `file_path` varchar(64) DEFAULT NULL COMMENT '文件路径',
    `file_link` varchar(64) DEFAULT NULL COMMENT '文件全量路径',
    `file_ext` varchar(64) DEFAULT NULL COMMENT '文件扩展名',
    `md5` varchar(64) DEFAULT NULL COMMENT '文件md5',
    `file_size` bigint(19) DEFAULT NULL COMMENT '文件大小',
    `store_type` varchar(64) DEFAULT NULL COMMENT '存储类型[local,oss,cos,qiniu...]',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`resume_store_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `resume_user`;
CREATE TABLE IF NOT EXISTS `resume_user`(
    `resume_user_id` bigint(19) NOT NULL COMMENT '简历用户ID',
    `resume_file_id` bigint(19) DEFAULT NULL COMMENT '简历文件ID',
    `account_instance_id` bigint(19) DEFAULT NULL COMMENT '账号实例ID，解析后自动创建回填',
    `user_instance_id` bigint(19) DEFAULT NULL COMMENT '用户实例ID，账号实名认证后回填',
    `user_email` varchar(64) DEFAULT NULL COMMENT '申请人邮箱,pdfbox解析',
    `user_phone` varchar(64) DEFAULT NULL COMMENT '手机号,pdfbox解析',
    `user_name` varchar(64) DEFAULT NULL COMMENT '用户姓名',
    `user_gender` integer(11) DEFAULT NULL COMMENT '性别[1:男，2:女]',
    `user_age` integer(11) DEFAULT NULL COMMENT '年龄',
    `working_age` integer(11) DEFAULT NULL COMMENT '工作年限',
    `birth_date` datetime DEFAULT NULL COMMENT '出生日期',
    `profile_photo` varchar(64) DEFAULT NULL COMMENT '头像',
    `self_appraise` varchar(64) DEFAULT NULL COMMENT '自我评价',
    `advantage` varchar(64) DEFAULT NULL COMMENT '亮点优势',
    `extension` varchar(64) DEFAULT NULL COMMENT '存储技能相关的详细说明JSON',
    `version` integer(11) DEFAULT NULL COMMENT '用户简历版本',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`resume_user_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `resume_education`;
CREATE TABLE IF NOT EXISTS `resume_education`(
    `resume_education_id` bigint(19) NOT NULL COMMENT '简历教育ID',
    `resume_file_id` bigint(19) DEFAULT NULL COMMENT '简历文件ID',
    `resume_user_id` bigint(19) DEFAULT NULL COMMENT '简历用户ID',
    `degree` varchar(64) DEFAULT NULL COMMENT '学历(高中',
    `school` varchar(64) DEFAULT NULL COMMENT '学校名称',
    `major` varchar(64) DEFAULT NULL COMMENT '专业(计算机...)',
    `start_time` varchar(64) DEFAULT NULL COMMENT '开始时间',
    `end_time` varchar(64) DEFAULT NULL COMMENT '结束时间',
    `state` tinyint(4) DEFAULT NULL COMMENT '是否可用0-可用，1-不可用',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`resume_education_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `resume_skill`;
CREATE TABLE IF NOT EXISTS `resume_skill`(
    `resume_skills_id` bigint(19) DEFAULT NULL COMMENT '简历技能ID',
    `resume_file_id` bigint(19) DEFAULT NULL COMMENT '简历文件ID',
    `resume_user_id` bigint(19) DEFAULT NULL COMMENT '简历用户ID',
    `skill_name` varchar(64) DEFAULT NULL COMMENT '技能名称',
    `proficiency` varchar(64) DEFAULT NULL COMMENT '熟练度ENUM ('beginner','intermediate','advanced','expert') ',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`resume_skills_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `resume_certificate`;
CREATE TABLE IF NOT EXISTS `resume_certificate`(
    `resume_certificate_id` bigint(19) NOT NULL COMMENT '简历证书ID',
    `resume_file_id` bigint(19) DEFAULT NULL COMMENT '简历文件ID',
    `resume_user_id` bigint(19) DEFAULT NULL COMMENT '简历用户ID',
    `certificate_name` varchar(64) DEFAULT NULL COMMENT '证书名称',
    `issuer` varchar(64) DEFAULT NULL COMMENT '证书颁发机构',
    `issue_date` varchar(64) DEFAULT NULL COMMENT '证书获取时间',
    `expire_date` varchar(64) DEFAULT NULL COMMENT '证书过期时间',
    `certificate_url` varchar(64) DEFAULT NULL COMMENT '证书验证链接',
    `description` varchar(64) DEFAULT NULL COMMENT '证书描述（如 "云计算架构师认证"）',
    `state` tinyint(4) DEFAULT NULL COMMENT '是否可用0-可用，1-不可用',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`resume_certificate_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `resume_tag`;
CREATE TABLE IF NOT EXISTS `resume_tag`(
    `resume_tag_value_id` bigint(19) DEFAULT NULL COMMENT '简历标签ID',
    `resume_file_id` bigint(19) DEFAULT NULL COMMENT '简历文件ID',
    `resume_userd` bigint(19) DEFAULT NULL COMMENT '简历用户ID',
    `tag_name` varchar(64) DEFAULT NULL COMMENT '标签名',
    `tag_code` varchar(64) DEFAULT NULL COMMENT 'code',
    `value` varchar(64) DEFAULT NULL COMMENT '标签值',
    `color` varchar(64) DEFAULT NULL COMMENT '标签颜色',
    `seq` integer(11) DEFAULT NULL COMMENT '标签序号',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`resume_tag_value_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `resume_application`;
CREATE TABLE IF NOT EXISTS `resume_application`(
    `resume_application_id` bigint(19) NOT NULL COMMENT '简历申请ID',
    `resume_file_id` bigint(19) DEFAULT NULL COMMENT '简历文件ID',
    `resume_user_id` bigint(19) DEFAULT NULL COMMENT '简历用户ID',
    `org_instance_id` bigint(19) DEFAULT NULL COMMENT '组织实例ID',
    `org_position_id` bigint(19) DEFAULT NULL COMMENT '组织岗位ID',
    `position_no` varchar(64) DEFAULT NULL COMMENT '岗位编号[P_6位数字]',
    `position_name` varchar(64) DEFAULT NULL COMMENT '岗位名称[java高级工程师,架构师]',
    `location` varchar(64) DEFAULT NULL COMMENT '所在地',
    `expected_salary` varchar(64) DEFAULT NULL COMMENT '期望薪资',
    `duty_time` datetime DEFAULT NULL COMMENT '到岗时间',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`resume_application_id`)
) ENGINE=InnoDB COMMENT='';


