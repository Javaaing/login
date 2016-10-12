package org.agtsys.util;

import java.io.OutputStream;

public interface Captchca {
       String generate(OutputStream os) throws Exception;
}
