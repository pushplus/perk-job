package com.xxl.job.admin.dto;

/**
 * @author chensiyuan26
 * @date 2022/1/4
 */
public class PushplusSendDto {

    private String token;

    private String title;

    private String content;

    private String topic;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
