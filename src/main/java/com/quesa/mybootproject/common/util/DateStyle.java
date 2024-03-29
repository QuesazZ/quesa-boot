package com.quesa.mybootproject.common.util;

public enum DateStyle
{
	/**
	 * yyyy-MM
	 */
	YYYY_MM("yyyy-MM", false),
	/**
	 * yyyy-MM-dd
	 */
	YYYY_MM_DD("yyyy-MM-dd", false),
	/**
	 *  yyyy-MM-dd HH
	 */
	YYYY_MM_DD_HH("yyyy-MM-dd HH", false),
	/**
	 * yyyy-MM-dd HH:mm
	 */
	YYYY_MM_DD_HH_MM("yyyy-MM-dd HH:mm", false),
	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	YYYY_MM_DD_HH_MM_SS("yyyy-MM-dd HH:mm:ss", false),
	/**
	 * yyyy/MM
	 */
	YYYY_MM_EN("yyyy/MM", false),
	/**
	 * yyyy/MM/dd
	 */
	YYYY_MM_DD_EN("yyyy/MM/dd", false),
	/**
	 * yyyyMMdd
	 */
	YYYYMMDD("yyyyMMdd", false),
	/**
	 * yyyy/MM/dd HH:mm
	 */
	YYYY_MM_DD_HH_MM_EN("yyyy/MM/dd HH:mm", false),
	/**
	 * yyyy/MM/dd HH:mm:ss
	 */
	YYYY_MM_DD_HH_MM_SS_EN("yyyy/MM/dd HH:mm:ss", false),
	/**
	 * yyyy年MM月
	 */
	YYYY_MM_CN("yyyy年MM月", false),
	/**
	 * yyyy年MM月dd日
	 */
	YYYY_MM_DD_CN("yyyy年MM月dd日", false),
	/**
	 * yyyy年MM月dd日 HH:mm
	 */
	YYYY_MM_DD_HH_MM_CN("yyyy年MM月dd日 HH:mm", false),
	/**
	 * yyyy年MM月dd日 HH:mm:ss
	 */
	YYYY_MM_DD_HH_MM_SS_CN("yyyy年MM月dd日 HH:mm:ss", false),
	/**
	 * HH:mm
	 */
	HH_MM("HH:mm", true),
	/**
	 * "HH:mm:ss"
	 */
	HH_MM_SS("HH:mm:ss", true),
	/**
	 * MM-dd
	 */
	MM_DD("MM-dd", true),
	/**
	 * MM-dd HH:mm
	 */
	MM_DD_HH_MM("MM-dd HH:mm", true),
	/**
	 * MM-dd HH:mm:ss
	 */
	MM_DD_HH_MM_SS("MM-dd HH:mm:ss", true),
	/**
	 * MM/dd
	 */
	MM_DD_EN("MM/dd", true),
	/**
	 * MM/dd HH:mm
	 */
	MM_DD_HH_MM_EN("MM/dd HH:mm", true),
	/**
	 * MM/dd HH:mm:ss
	 */
	MM_DD_HH_MM_SS_EN("MM/dd HH:mm:ss", true),
	/**
	 * MM月dd日
	 */
	MM_DD_CN("MM月dd日", true),
	/**
	 * MM月dd日 HH:mm
	 */
	MM_DD_HH_MM_CN("MM月dd日 HH:mm", true),
	/**
	 * MM月dd日 HH:mm:ss
	 */
	MM_DD_HH_MM_SS_CN("MM月dd日 HH:mm:ss", true);

	private String value;

	private boolean isShowOnly;

	DateStyle(String value, boolean isShowOnly)
	{
		this.value = value;
		this.isShowOnly = isShowOnly;
	}

	public String getValue()
	{
		return value;
	}

	public boolean isShowOnly()
	{
		return isShowOnly;
	}
}
