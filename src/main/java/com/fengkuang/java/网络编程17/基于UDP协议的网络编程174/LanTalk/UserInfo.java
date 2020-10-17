package com.fengkuang.java.网络编程17.基于UDP协议的网络编程174.LanTalk;
import java.net.*;
public class UserInfo {
    // 该用户的图标
    private String icon;
    // 该用户的名字
    private String name;
    // 该用户的MulitcastSocket所在的IP和端口
    private SocketAddress address;
    // 该用户失去联系的次数
    private int lost;
    // 该用户对应的交谈窗口
    private ChatFrame chatFrame;
    public UserInfo() {
    }
    // 有参数的构造器
    public UserInfo(String icon, String name, SocketAddress address, int lost) {
        this.icon = icon;
        this.name = name;
        this.address = address;
        this.lost = lost;
    }
    // 省略所有成员变量的setter和getter方法
    // icon的setter和getter方法
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getIcon() {
        return this.icon;
    }
    // name的setter和getter方法
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    // address的setter和getter方法
    public void setAddress(SocketAddress address) {
        this.address = address;
    }
    public SocketAddress getAddress() {
        return this.address;
    }
    // lost的setter和getter方法
    public void setLost(int lost) {
        this.lost = lost;
    }
    public int getLost() {
        return this.lost;
    }
    // chatFrame的setter和getter方法
    public void setChatFrame(ChatFrame chatFrame) {
        this.chatFrame = chatFrame;
    }
    public ChatFrame getChatFrame() {
        return this.chatFrame;
    }
    // 使用address作为该用户的标识，所以根据address作为
    // 重写hashCode()和equals方法的标准
    public int hashCode() {
        return address.hashCode();
    }
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == UserInfo.class) {
            var target = (UserInfo) obj;
            if (address != null) {
                return address.equals(target.getAddress());
            }
        }
        return false;
    }
}