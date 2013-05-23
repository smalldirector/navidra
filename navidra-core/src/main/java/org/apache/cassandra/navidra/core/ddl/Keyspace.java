package org.apache.cassandra.navidra.core.ddl;

import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;

/**
 * The data definition for keyspace
 * 
 * @author Gabriel
 * 
 */
public class Keyspace {

	private String name;
	private String stragegyClass;
	private Map<String, String> strategyOptions;
	private boolean isDurableWrites;
	private List<ColumnFamily> columnFamilies;
	
	public Keyspace() {
		strategyOptions = Maps.newTreeMap();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStragegyClass() {
		return stragegyClass;
	}

	public void setStragegyClass(String stragegyClass) {
		this.stragegyClass = stragegyClass;
	}

	public String getStrategyOption(String key) {
		return strategyOptions.get(key);
	}

	public void setStrategyOptions(String key, String value) {
		strategyOptions.put(key, value);
	}

	public boolean isDurableWrites() {
		return isDurableWrites;
	}

	public void setDurableWrites(boolean isDurableWrites) {
		this.isDurableWrites = isDurableWrites;
	}

	public List<ColumnFamily> getColumnFamilies() {
		return columnFamilies;
	}

	public void setColumnFamilies(List<ColumnFamily> columnFamilies) {
		this.columnFamilies = columnFamilies;
	}
}
