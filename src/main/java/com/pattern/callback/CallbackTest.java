package com.pattern.callback;

/**
 * 客户端发送msg给服务端，服务端处理后（5秒），回调给客户端，告知处理成功
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/10/28
 * Time: 18:00
 */
public class CallbackTest {

    public static void main(String[] args) {

        Server server = new Server();

        Client client = new Client(server);

        client.sendMsg("是否到账");
    }
}
