package tdd.training.ond1.wechat;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 微信用户
 * 聚合根
 */
@Data
@Accessors(chain = true)
public class WeChatUser {
    
    /**
     * 用户id
     */
    private Long id;
    
    /**
     * 朋友圈动态需要过滤的用户id集合
     */
    private Set<Long> friendCircleFilterIdSet = new HashSet<>();
    
    /**
     * 好友列表
     */
    private List<WeChatUser> friendList = new ArrayList<>();
    
    /**
     * 当前用户发布的朋友圈态列表
     */
    private List<News> newsList = new ArrayList<>();
    
    /**
     * 获取朋友圈动态列表
     */
    public List<News> listFriendCircleNews() {
        return friendList.stream()
                .map(WeChatUser::getNewsList)
                .flatMap(Collection::stream)
                .filter(news -> !friendCircleFilterIdSet.contains(news.getWeChatUserId()))
                .collect(Collectors.toList());
    }
    
    /**
     * 不看他
     * @param weChatUserId 微信用户id
     * @return 返回当前用户
     */
    public WeChatUser ignoreHim(Long weChatUserId) {
        friendCircleFilterIdSet.add(weChatUserId);
        return this;
    }
    
    /**
     * 不让他看我
     * @param user 微信用户
     */
    public void ignoreMe(WeChatUser user) {
        user.getFriendCircleFilterIdSet().add(this.id);
    }
}
