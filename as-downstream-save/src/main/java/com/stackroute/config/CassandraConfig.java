package com.stackroute.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.cassandra.config.*;
//import org.springframework.data.cassandra.config.java.AbstractCassandraConfiguration;
//import org.springframework.data.cassandra.convert.MappingCassandraConverter;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.convert.CassandraConverter;
import org.springframework.data.cassandra.core.convert.MappingCassandraConverter;
import org.springframework.data.cassandra.core.mapping.BasicCassandraMappingContext;
//import org.springframework.data.cassandra.mapping.BasicCassandraMappingContext;
import org.springframework.data.cassandra.core.mapping.CassandraMappingContext;
import org.springframework.data.cassandra.core.mapping.SimpleUserTypeResolver;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

/**
 *
 * @author bl4ckbird
 */
@Configuration
//@PropertySource(value = { "classpath:cassandra.properties" })
@EnableCassandraRepositories
public class CassandraConfig extends AbstractCassandraConfiguration {
//  private static final Log LOGGER = LogFactory.getLog(CassandraConfig.class);

  @Autowired
  private Environment environment;

  @Override
  protected String getKeyspaceName() {
    return "demo";
  }

  @Override
  @Bean
  public CassandraClusterFactoryBean cluster() {
    final CassandraClusterFactoryBean cluster = new CassandraClusterFactoryBean();
    cluster.setContactPoints("localhost");
    cluster.setPort(9042);
//    LOGGER.info("Cluster created with contact points [" + environment.getProperty("cassandra.contactpoints") + "] " + "& port [" + Integer.parseInt(environment.getProperty("cassandra.port")) + "].");
    return cluster;
  }


  @Bean
  public CassandraMappingContext mappingContext() throws ClassNotFoundException {
    BasicCassandraMappingContext mappingContext = new BasicCassandraMappingContext();
    mappingContext.setInitialEntitySet(CassandraEntityClassScanner.scan("com.stackroute.as-downstream-save.model"));
    mappingContext.setUserTypeResolver(new SimpleUserTypeResolver(cluster().getObject(),getKeyspaceName()));
    return mappingContext;
  }

  @Bean
  public CassandraConverter converter() throws ClassNotFoundException {
    return new MappingCassandraConverter(mappingContext());
  }

  @Bean

  public CassandraSessionFactoryBean session1() throws ClassNotFoundException {
    CassandraSessionFactoryBean session = new CassandraSessionFactoryBean();
    session.setCluster(cluster().getObject());
    session.setKeyspaceName(getKeyspaceName());
    session.setConverter(converter());
    session.setSchemaAction(SchemaAction.RECREATE);
    return session;
  }
}
