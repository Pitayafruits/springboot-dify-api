package com.pitayafruit.resp;

import java.io.Serializable;
import lombok.Data;


/**
 * Dify流式调用响应.
 */
@Data
public class StreamResponse implements Serializable {

    /**
     * 不同模式下的事件类型.
     */
    private String event;

    /**
     * agent_thought id.
     */
    private String id;

    /**
     * 任务ID.
     */
    private String taskId;

    /**
     * 消息唯一ID.
     */
    private String messageId;

    /**
     * LLM 返回文本块内容.
     */
    private String answer;

    /**
     * 创建时间戳.
     */
    private Long createdAt;

    /**
     * 会话 ID.
     */
    private String conversationId;
}
