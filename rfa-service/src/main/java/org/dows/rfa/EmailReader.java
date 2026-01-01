package org.dows.rfa;

import com.mybatisflex.core.query.QueryWrapper;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dows.rade.util.JsonConfigUtil;
import org.dows.rfa.dao.ResumeConfigDao;
import org.dows.rfa.entity.ResumeConfigEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmailReader implements ResumeReader {

    private final ResumeConfigDao resumeConfigDao;

    private final Map<String,MailClient> mailClients;

    @PostConstruct
    public void read() {
        log.info("reading resume from email...");
        //1. 根据当前appId 获取邮件配置，构建不同渠道的邮件读取器
        QueryWrapper wrapper = QueryWrapper.create().from(ResumeConfigEntity.class)
                .eq(ResumeConfigEntity::getConfigName, EmailConfig.class.getName());
        ResumeConfigEntity resumeConfigEntity = resumeConfigDao.getOne(wrapper);
        EmailConfig emailConfig = JsonConfigUtil.fromJsonConfig(resumeConfigEntity.getConfigJson(), EmailConfig.class);
        List<ServerEndpoint> serverEndpoints = emailConfig.getServerEndpoints();
        for (ServerEndpoint serverEndpoint : serverEndpoints) {
            String channel = serverEndpoint.getChannel();
            MailClient mailClient = mailClients.get(channel);
            if(mailClient == null){
                continue;
            }
            mailClient.read(serverEndpoint);
        }
    }

}
