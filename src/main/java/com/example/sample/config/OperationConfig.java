package com.example.sample.config;
 
import javax.sql.DataSource;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.dialect.Dialect;
 
public class OperationConfig implements Config {
 
  private Dialect dialect;
 
  private DataSource dataSource;
 
  @Override
  public Dialect getDialect() {
      return dialect;
  }
 
  public void setDialect(Dialect dialect) {
      this.dialect = dialect;
  }
 
  @Override
  public DataSource getDataSource() {
      return dataSource;
  }
 
  public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
  }
}
