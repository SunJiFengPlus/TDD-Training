package tdd.training.ond1.wechat;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 朋友圈动态
 * 值对象
 */
@Data
@Accessors(chain = true)
public class News {
    
    /**
     * 动态发布的用户id 
     */
    private Long weChatUserId;
    
    /**
     * 动态信息
     */
    private String message;
}
