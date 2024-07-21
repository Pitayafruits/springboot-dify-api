package com.pitayafruit.req;

import com.alibaba.fastjson2.annotation.JSONField;
import java.io.Serializable;
import java.util.Map;
import lombok.Data;

/**
 * Dify请求体.
 */
@Data
public class DifyRequestBody implements Serializable {

    /**
     * 用户输入/提问内容.
     */
    private String query;

    /**
     * 允许传入 App 定义的各变量值.
     */
    private Map<String, String> inputs;

    /**
     * 响应模式，streaming 流式，blocking 阻塞.
     */
    @JSONField(name = "response_mode")
    private String responseMode;

    /**
     * 用户标识.
     */
    private String user;

    /**
     * 会话id.
     */
    @JSONField(name = "conversation_id")
    private String conversationId;
}
