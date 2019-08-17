package com.app;

public class Model {

	private int id;
	private String modelName;
	private String modelVersion;

	public Model() {
		super();
	}

	/**
	 * @return the modelId
	 */

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the modelName
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * @param modelName the modelName to set
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	/**
	 * @return the modelVersion
	 */
	public String getModelVersion() {
		return modelVersion;
	}

	/**
	 * @param modelVersion the modelVersion to set
	 */
	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
	}

	@Override
	public String toString() {
		return "Model [modelId=" + id + ", modelName=" + modelName + ", modelVersion=" + modelVersion + "]";
	}

}
