package com.oup.integration.sps.materialmaster.filefilter;

import org.apache.camel.component.file.GenericFile;
import org.apache.camel.component.file.GenericFileFilter;

public class CustomFileFilter<T> implements GenericFileFilter<T> {

	@Override
	public boolean accept(GenericFile<T> file) {
		// TODO Auto-generated method stub
		 // we only want report files 
		
	
        return file.getFileName().startsWith("es");
	}
}