package service.impl;

import dao.ConfigurationDao;
import service.Configuration;

public class ConfigurationService implements Configuration {
	
	ConfigurationDao configurationDao;

	@Override
	public String getConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getConfigInt() {
		
		return configurationDao.getLength();
	}

	public ConfigurationDao getConfigurationDao() {
		return configurationDao;
	}

	public void setConfigurationDao(ConfigurationDao configurationDao) {
		this.configurationDao = configurationDao;
	}
	
	

}
