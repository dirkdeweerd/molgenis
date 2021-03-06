package org.molgenis.charts.requests;

import javax.validation.constraints.NotNull;

public class BoxPlotChartRequest extends ChartRequest
{
	@NotNull
	private String observableFeature;

	private String split;

	/**
	 * @return the observableFeature
	 */
	public String getObservableFeature()
	{
		return observableFeature;
	}

	/**
	 * @param observableFeature the observableFeature to set
	 */
	public void setObservableFeature(String observableFeature)
	{
		this.observableFeature = observableFeature;
	}

	/**
	 * @return the split
	 */
	public String getSplit()
	{
		return split;
	}

	/**
	 * @param split the split to set
	 */
	public void setSplit(String split)
	{
		this.split = split;
	}
}