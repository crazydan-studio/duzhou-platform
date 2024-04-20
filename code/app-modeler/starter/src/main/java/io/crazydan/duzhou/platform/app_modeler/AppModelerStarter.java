package io.crazydan.duzhou.platform.app_modeler;

import io.crazydan.duzhou.framework.starter.SpringStarter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用 Spring 启动器
 * <p/>
 * 启动器只能在应用服务中实现，否则，将不会扫描到应用服务的
 * classpath 中的资源。
 */
@SpringBootApplication
public class AppModelerStarter extends SpringStarter {

    public static void main(String[] args) {
        run(AppModelerStarter.class, args);
    }
}
