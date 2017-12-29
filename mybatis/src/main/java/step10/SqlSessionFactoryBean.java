package step10;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.config.AbstractFactoryBean;

public class SqlSessionFactoryBean extends AbstractFactoryBean<SqlSessionFactory> {
	
	String configLocation;
	

	public void setConfigLocation(String configLocation) {
		this.configLocation = configLocation;
	}

	@Override
	public Class<?> getObjectType() {
		return SqlSessionFactory.class;
	}

	@Override
	protected SqlSessionFactory createInstance() throws Exception {
		InputStream inputStream =
				Resources.getResourceAsStream("step10/mybatis-config.xml");
		return new SqlSessionFactoryBuilder().build(inputStream);
	}

}
