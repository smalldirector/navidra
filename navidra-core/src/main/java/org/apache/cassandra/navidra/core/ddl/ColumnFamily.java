package org.apache.cassandra.navidra.core.ddl;

import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;

/**
 * The data definition for column family.
 * @author Gabriel
 *
 */
public class ColumnFamily {

	private int id;
	private String keyspace;
	private String name;
	private String columnType;
	private String comparator;
	private String subComparator;
	private String comment;
	private double readRepairChance;
	private List<Column> columns;
	private int gcGraceSeconds;
	private String defaultValidationClass;
	private int minCompactionThreshold;
	private int maxCompactionThreshold;
	private boolean replicateOnWrite;
	private String keyValidationClass;
	private String caching;
	private String compactionStrategy;
	private Map<String, String> compactionStrategyOptions;
	private Map<String, String> compressionOptions;
	private double dcLocalReadRepairChance;
	
	public ColumnFamily() {
		compactionStrategyOptions = Maps.newTreeMap();
		compressionOptions = Maps.newTreeMap();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKeyspace() {
		return keyspace;
	}
	public void setKeyspace(String keyspace) {
		this.keyspace = keyspace;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColumnType() {
		return columnType;
	}
	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}
	public String getComparator() {
		return comparator;
	}
	public void setComparator(String comparator) {
		this.comparator = comparator;
	}
	public String getSubComparator() {
		return subComparator;
	}
	public void setSubComparator(String subComparator) {
		this.subComparator = subComparator;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public double getReadRepairChance() {
		return readRepairChance;
	}
	public void setReadRepairChance(double readRepairChance) {
		this.readRepairChance = readRepairChance;
	}
	public List<Column> getColumns() {
		return columns;
	}
	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}
	public int getGcGraceSeconds() {
		return gcGraceSeconds;
	}
	public void setGcGraceSeconds(int gcGraceSeconds) {
		this.gcGraceSeconds = gcGraceSeconds;
	}
	public String getDefaultValidationClass() {
		return defaultValidationClass;
	}
	public void setDefaultValidationClass(String defaultValidationClass) {
		this.defaultValidationClass = defaultValidationClass;
	}
	public int getMinCompactionThreshold() {
		return minCompactionThreshold;
	}
	public void setMinCompactionThreshold(int minCompactionThreshold) {
		this.minCompactionThreshold = minCompactionThreshold;
	}
	public int getMaxCompactionThreshold() {
		return maxCompactionThreshold;
	}
	public void setMaxCompactionThreshold(int maxCompactionThreshold) {
		this.maxCompactionThreshold = maxCompactionThreshold;
	}
	public boolean isReplicateOnWrite() {
		return replicateOnWrite;
	}
	public void setReplicateOnWrite(boolean replicateOnWrite) {
		this.replicateOnWrite = replicateOnWrite;
	}
	public String getKeyValidationClass() {
		return keyValidationClass;
	}
	public void setKeyValidationClass(String keyValidationClass) {
		this.keyValidationClass = keyValidationClass;
	}
	public String getCaching() {
		return caching;
	}
	public void setCaching(String caching) {
		this.caching = caching;
	}
	public String getCompactionStrategy() {
		return compactionStrategy;
	}
	public void setCompactionStrategy(String compactionStrategy) {
		this.compactionStrategy = compactionStrategy;
	}
	public String getCompactionStrategyOption(String key) {
		return compactionStrategyOptions.get(key);
	}
	public void setCompactionStrategyOption(String key, String value) {
		compactionStrategyOptions.put(key, value);
	}
	public String getCompressionOption(String key) {
		return compressionOptions.get(key);
	}
	public void setCompressionOption(String key, String value) {
		compressionOptions.put(key, value);
	}
	public double getDcLocalReadRepairChance() {
		return dcLocalReadRepairChance;
	}
	public void setDcLocalReadRepairChance(double dcLocalReadRepairChance) {
		this.dcLocalReadRepairChance = dcLocalReadRepairChance;
	}
	
}
