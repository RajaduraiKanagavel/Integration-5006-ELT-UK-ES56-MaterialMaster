package com.oup.integration.sps.materialmaster.filefilter;

import org.apache.camel.Exchange;
import org.apache.camel.Expression;

public class FileRename implements Expression  {

	@Override
	public <String> String evaluate(Exchange arg0, Class<String> arg1) {
		// TODO Auto-generated method stub
		
		java.lang.String fileName= arg0.getIn().getHeader("CamelFileName").toString();		
		java.lang.String newFileName="x"+fileName.substring(1, fileName.length());		
		return (String) newFileName;
	}

}
