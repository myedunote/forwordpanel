package com.leeroy.forwordpanel.forwordpanel.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * 端口转发实体
 */
@Data
public class UserPortForward {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    // 中转用户
    private Integer userId;
    // 监听本地端口
    private Integer localPort;
    // 目标ip
    private String remoteIp;
    // 目标主机地址
    private String remoteHost;
    // 流量使用量
    private Long dataUsage;
    // 目标主机端口
    private Integer remotePort;
    // 创建时间
    private Long createTime;
    //更新时间
    private Long updateTime;
    //删除表示
    private Boolean deleted;
    //禁用表示
    private Boolean disabled;
}