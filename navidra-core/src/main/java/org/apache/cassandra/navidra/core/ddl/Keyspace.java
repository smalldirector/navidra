package org.apache.cassandra.navidra.core.ddl;

import java.util.List;
import java.util.Map;

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

	public Map<String, String> getStrategyOptions() {
		return strategyOptions;
	}

	public void setStrategyOptions(Map<String, String> strategyOptions) {
		this.strategyOptions = strategyOptions;
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
