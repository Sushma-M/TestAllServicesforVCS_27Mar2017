/*Copyright (c) 2016-2017 vcstest4.com All Rights Reserved.
 This software is the confidential and proprietary information of vcstest4.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcstest4.com*/
package com.testallservicesforvcs.adventureworks2014.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testallservicesforvcs.adventureworks2014.EmployeePayHistory;
import com.testallservicesforvcs.adventureworks2014.EmployeePayHistoryId;

/**
 * Service object for domain model class {@link EmployeePayHistory}.
 */
public interface EmployeePayHistoryService {

    /**
     * Creates a new EmployeePayHistory. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on EmployeePayHistory if any.
     *
     * @param employeePayHistory Details of the EmployeePayHistory to be created; value cannot be null.
     * @return The newly created EmployeePayHistory.
     */
	EmployeePayHistory create(EmployeePayHistory employeePayHistory);


	/**
	 * Returns EmployeePayHistory by given id if exists.
	 *
	 * @param employeepayhistoryId The id of the EmployeePayHistory to get; value cannot be null.
	 * @return EmployeePayHistory associated with the given employeepayhistoryId.
     * @throws EntityNotFoundException If no EmployeePayHistory is found.
	 */
	EmployeePayHistory getById(EmployeePayHistoryId employeepayhistoryId) throws EntityNotFoundException;

    /**
	 * Find and return the EmployeePayHistory by given id if exists, returns null otherwise.
	 *
	 * @param employeepayhistoryId The id of the EmployeePayHistory to get; value cannot be null.
	 * @return EmployeePayHistory associated with the given employeepayhistoryId.
	 */
	EmployeePayHistory findById(EmployeePayHistoryId employeepayhistoryId);


	/**
	 * Updates the details of an existing EmployeePayHistory. It replaces all fields of the existing EmployeePayHistory with the given employeePayHistory.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on EmployeePayHistory if any.
     *
	 * @param employeePayHistory The details of the EmployeePayHistory to be updated; value cannot be null.
	 * @return The updated EmployeePayHistory.
	 * @throws EntityNotFoundException if no EmployeePayHistory is found with given input.
	 */
	EmployeePayHistory update(EmployeePayHistory employeePayHistory) throws EntityNotFoundException;

    /**
	 * Deletes an existing EmployeePayHistory with the given id.
	 *
	 * @param employeepayhistoryId The id of the EmployeePayHistory to be deleted; value cannot be null.
	 * @return The deleted EmployeePayHistory.
	 * @throws EntityNotFoundException if no EmployeePayHistory found with the given id.
	 */
	EmployeePayHistory delete(EmployeePayHistoryId employeepayhistoryId) throws EntityNotFoundException;

	/**
	 * Find all EmployeePayHistories matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching EmployeePayHistories.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<EmployeePayHistory> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all EmployeePayHistories matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching EmployeePayHistories.
     *
     * @see Pageable
     * @see Page
	 */
    Page<EmployeePayHistory> findAll(String query, Pageable pageable);

    /**
	 * Exports all EmployeePayHistories matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
	 */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the EmployeePayHistories in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the EmployeePayHistory.
	 */
	long count(String query);

	/**
	 * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
	 * @return Paginated data with included fields.

     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
	Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);


}

