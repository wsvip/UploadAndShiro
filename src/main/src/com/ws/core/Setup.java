package com.ws.core;

import org.nutz.lang.Encoding;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.mvc.NutConfig;

import java.nio.charset.Charset;

/**
 * Created by ws on 2018/6/12.
 */
public class Setup implements org.nutz.mvc.Setup {
    private static final Log log = Logs.get();
    public void init(NutConfig config) {
        try {
            // 环境检查
            if (!Charset.defaultCharset().name().equalsIgnoreCase(Encoding.UTF8)) {
                log.warn("This project must run in UTF-8, pls add -Dfile.encoding=UTF-8 to JAVA_OPTS");
            }
            log.info("\n _  _ _   _ _____ ______      ___  __\n" +
                    "| \\| | | | |_   _|_  /\\ \\    / / |/ /\n" +
                    "| .` | |_| | | |  / /  \\ \\/\\/ /| ' < \n" +
                    "|_|\\_|\\___/  |_| /___|  \\_/\\_/ |_|\\_\\");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void destroy(NutConfig nutConfig) {

    }
}
