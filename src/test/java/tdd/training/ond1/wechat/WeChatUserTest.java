package tdd.training.ond1.wechat;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WeChatUserTest {
    
    /**
     * 用户1是用户2的好友, 用户1没有"不看他的设置", 用户2发了一条朋友圈, 用户1能收到这条动态 
     */
    @Test
    public void testListFriendCircleNews1() {
        WeChatUser input = new WeChatUser()
                .setId(1L)
                .setFriendList(Collections.singletonList(
                        new WeChatUser().setId(2L).setNewsList(Collections.singletonList(new News().setWeChatUserId(2L)))
                ));
    
        List<News> output = input.listFriendCircleNews();
        
        assertThat(output).hasSize(1)
                .extracting(News::getWeChatUserId)
                .containsOnly(2L);
    }
    
    /**
     * 用户1是用户2的好友, 用户1设置不看用户2, 用户2发了一条朋友圈, 用户1不能收到这条动态 
     */
    @Test
    public void testListFriendCircleNews2() {
        WeChatUser input = new WeChatUser()
                .setId(1L)
                .setFriendList(Collections.singletonList(
                        new WeChatUser().setId(2L).setNewsList(Collections.singletonList(new News().setWeChatUserId(2L)))
                )).ignoreHim(2L);
        
        List<News> output = input.listFriendCircleNews();
        
        assertThat(output).isEmpty();
    }
    
    /**
     * 用户1是用户2的好友, 用户1设置不让用户2看, 用户1发了一条朋友圈, 用户2不能收到这条动态 
     */
    @Test
    public void testListFriendCircleNews4() {
        WeChatUser user1 = new WeChatUser()
                .setId(1L)
                .setNewsList(Collections.singletonList(new News().setWeChatUserId(1L)));
        WeChatUser user2 = new WeChatUser().setId(2L);
        user1.setFriendList(Collections.singletonList(user2));
        user2.setFriendList(Collections.singletonList(user1));
        
        user1.ignoreMe(user2);
        List<News> output = user2.listFriendCircleNews();
    
        assertThat(output).isEmpty();
    }
    
    /**
     * 用户1是用户2的好友, 用户1没有设置"不让他看", 用户1发了一条朋友圈, 用户2能收到这条动态 
     */
    @Test
    public void testListFriendCircleNews5() {
        WeChatUser user1 = new WeChatUser()
                .setId(1L)
                .setNewsList(Collections.singletonList(new News().setWeChatUserId(1L)));
        WeChatUser user2 = new WeChatUser().setId(2L);
        user1.setFriendList(Collections.singletonList(user2));
        user2.setFriendList(Collections.singletonList(user1));
        
        List<News> output = user2.listFriendCircleNews();
        
        assertThat(output).hasSize(1)
                .extracting(News::getWeChatUserId)
                .containsOnly(1L);
    }
    
    /**
     * 用户1不是用户2的好友, 用户2发了一条朋友圈, 用户1不能收到这条动态 
     */
    @Test
    @Disabled("需求中没有明确描述这部分内容, 暂时禁用")
    public void testListFriendCircleNews3() {
        WeChatUser input = new WeChatUser().setId(1L);
        new WeChatUser().setId(2L).setNewsList(Collections.singletonList(new News().setWeChatUserId(2L)));
        
        List<News> output = input.listFriendCircleNews();
        
        assertThat(output).isEmpty();
    }
}