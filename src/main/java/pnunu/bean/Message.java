package pnunu.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Author: pnunu
 * @Date: 2018/12/27 21:35
 * @Description:
 */
@Data
public class Message {
    private Long id;    //id

    private String msg; //消息

    private Date sendTime;  //时间戳
}
