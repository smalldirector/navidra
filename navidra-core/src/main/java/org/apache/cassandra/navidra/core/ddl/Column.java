package org.apache.cassandra.navidra.core.ddl;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 * The data definition for column.
 * @author Gabriel
 *
 */
public class Column {

	private String name;
	private String validationClass;
	private String indexName;
	private String indexType;
	private Map<String, String> indexOptions;
	
	public Column() {
		indexOptions = Maps.newTreeMap();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValidationClass() {
		return validationClass;
	}
	public void setValidationClass(String validationClass) {
		this.validationClass = validationClass;
	}
	public String getIndexName() {
		return indexName;
	}
	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}
	public String getIndexType() {
		return indexType;
	}
	public void setIndexType(String indexType) {
		this.indexType = indexType;
	}
	public String getIndexOption(String key) {
		return indexOptions.get(key);
	}
	public void setIndexOption(String key, String value) {
		indexOptions.put(key, value);
	}
}
