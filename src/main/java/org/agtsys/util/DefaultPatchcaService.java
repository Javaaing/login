package org.agtsys.util;

import java.awt.Color;

import com.github.bingoohuang.patchca.background.SingleColorBackgroundFactory;
import com.github.bingoohuang.patchca.color.SingleColorFactory;
import com.github.bingoohuang.patchca.filter.predefined.CurvesRippleFilterFactory;
import com.github.bingoohuang.patchca.font.RandomFontFactory;
import com.github.bingoohuang.patchca.service.AbstractCaptchaService;
import com.github.bingoohuang.patchca.text.renderer.BestFitTextRenderer;
import com.github.bingoohuang.patchca.word.RandomWordFactory;

public class DefaultPatchcaService extends AbstractCaptchaService {
public DefaultPatchcaService(){
	init();
}

private void init() {
	serWordFactory();
	setFontFactory(); 
	//设置字体颜色
	this.colorFactory=new SingleColorFactory(new Color(25,60,170));
	//文本效果
	this.textRenderer=new BestFitTextRenderer();
	//背景
	this.backgroundFactory=new SingleColorBackgroundFactory();
	//干扰线
	this.filterFactory=new CurvesRippleFilterFactory(colorFactory);
	//设置宽和高
	width=60;
	height=22;
}

private void setFontFactory() {
	RandomWordFactory rwf=new RandomWordFactory();
	//设置文本内容，从以下子母中随机选择
	rwf.setCharacters("abcdefghkm23456789");
	rwf.setMaxLength(4);
	rwf.setMinLength(4);
	this.wordFactory=rwf;
}

private void serWordFactory() {
	RandomFontFactory rff=new RandomFontFactory();
	//设置字体大小
	rff.setMaxSize(30);
	rff.setMinSize(30);
	this.fontFactory=rff;
	
}
}
