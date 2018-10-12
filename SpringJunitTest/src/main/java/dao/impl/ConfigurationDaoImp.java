package dao.impl;

import constant.Constant;
import dao.ConfigurationDao;

public class ConfigurationDaoImp implements ConfigurationDao {
	
	Constant constants;

	@Override
	public int getLength() {
		return constants.getLength();
	}

	public Constant getConstants() {
		return constants;
	}

	public void setConstants(Constant constants) {
		this.constants = constants;
	}
	
	

}
