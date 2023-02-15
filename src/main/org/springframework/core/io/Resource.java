package org.springframework.core.io;

import java.io.InputStream;

/**
 * 该接口是对资源的抽象
 */
public interface Resource {
    InputStream getInputStream() throws Exception;
}
