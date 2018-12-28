package pnunu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pnunu.bean.Message;
import pnunu.provider.KafkaSender;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: pnunu
 * @Date: 2018/12/28 10:12
 * @Description:
 */
@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
    @Autowired
    private KafkaSender sender;
    @RequestMapping(value = "/test")
    public Map findMR3dValues(Message message) throws Exception {
        Map<String, Object> map = new HashMap<>();
        message.setSendTime(new Date());
        sender.send(message);
        map.put("key", message);
        return map;
    }
}
