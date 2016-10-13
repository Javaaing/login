package org.agtsys.service;

import java.io.OutputStream;

public interface CaptchcaService {
	String getCaptchca(OutputStream os) throws Exception;
}
