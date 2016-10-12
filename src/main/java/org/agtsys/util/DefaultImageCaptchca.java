package org.agtsys.util;

import java.io.OutputStream;

import com.github.bingoohuang.patchca.utils.encoder.EncoderHelper;

public class DefaultImageCaptchca implements ImageCaptchca{
	//图像格式  默认png
protected  String imageType="png";
//通过它更改默认图的样式
protected DefaultPatchcaService dps=new DefaultPatchcaService();
@Override
public String generate(OutputStream os) throws Exception {
	// TODO Auto-generated method stub
	return EncoderHelper.getChallangeAndWriteImage(dps, imageType, os);
}
@Override
public void setimageType(String type) {
	// TODO Auto-generated method stub
	this.imageType=type;
}
public void setDps(DefaultPatchcaService dps){
	this.dps=dps;
}
}
