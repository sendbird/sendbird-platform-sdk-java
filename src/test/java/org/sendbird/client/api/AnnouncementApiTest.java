/*
 * Sendbird Platform SDK
 * Sendbird Platform API SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@sendbird.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.sendbird.client.api;

import org.sendbird.client.*;
import org.sendbird.client.auth.*;
import org.openapitools.client.model.GetDetailedOpenRateOfAnnouncementGroupResponse;
import org.openapitools.client.model.GetStatisticsDailyResponse;
import org.openapitools.client.model.GetStatisticsMonthlyResponse;
import org.openapitools.client.model.GetStatisticsResponse;
import org.openapitools.client.model.ListAnnouncementGroupsResponse;
import org.openapitools.client.model.ScheduleAnnouncementData;
import org.openapitools.client.model.ScheduleAnnouncementResponse;
import org.openapitools.client.model.UpdateAnnouncementByIdData;
import org.openapitools.client.model.UpdateAnnouncementByIdResponse;
import org.openapitools.client.model.ViewAnnouncementByIdResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnnouncementApi
 */
public class AnnouncementApiTest {

    private final AnnouncementApi api = new AnnouncementApi();

    /**
     * Get detailed open rate of an announcement group
     *
     * ## Get detailed open rate of an announcement group  Retrieves the detailed open rate information of an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-detailed-open-rate-of-an-announcement-group ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailedOpenRateOfAnnouncementGroupTest() throws ApiException {
        //String apiToken = null;
        //String announcementGroup = null;
        //GetDetailedOpenRateOfAnnouncementGroupResponse response = api.getDetailedOpenRateOfAnnouncementGroup(apiToken, announcementGroup);
        // TODO: test validations
    }

    /**
     * Get statistics - weekly
     *
     * ## Get statistics  Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatisticsTest() throws ApiException {
        //String apiToken = null;
        //GetStatisticsResponse response = api.getStatistics(apiToken);
        // TODO: test validations
    }

    /**
     * Get statistics - daily
     *
     * ## Get statistics  Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatisticsDailyTest() throws ApiException {
        //String apiToken = null;
        //String startDate = null;
        //String endDate = null;
        //String startWeek = null;
        //String endWeek = null;
        //String startMonth = null;
        //String endMonth = null;
        //String announcementGroup = null;
        //GetStatisticsDailyResponse response = api.getStatisticsDaily(apiToken, startDate, endDate, startWeek, endWeek, startMonth, endMonth, announcementGroup);
        // TODO: test validations
    }

    /**
     * Get statistics - monthly
     *
     * ## Get statistics  Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatisticsMonthlyTest() throws ApiException {
        //String apiToken = null;
        //GetStatisticsMonthlyResponse response = api.getStatisticsMonthly(apiToken);
        // TODO: test validations
    }

    /**
     * List announcement groups
     *
     * ## List announcement groups  Retrieves a list of announcement groups.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-list-announcement-groups ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAnnouncementGroupsTest() throws ApiException {
        //String apiToken = null;
        //String token = null;
        //Integer limit = null;
        //ListAnnouncementGroupsResponse response = api.listAnnouncementGroups(apiToken, token, limit);
        // TODO: test validations
    }

    /**
     * Schedule an announcement
     *
     * ## Schedule an announcement  Schedules a new announcement. You can also schedule an announcement in the [Sendbird Dashboard](https://dashboard.sendbird.com).  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-schedule-an-announcement
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void scheduleAnnouncementTest() throws ApiException {
        //String apiToken = null;
        //ScheduleAnnouncementData scheduleAnnouncementData = null;
        //ScheduleAnnouncementResponse response = api.scheduleAnnouncement(apiToken, scheduleAnnouncementData);
        // TODO: test validations
    }

    /**
     * Update an announcement
     *
     * ## Update an announcement  Updates information of a specific announcement before it starts or changes the status of a specific announcement after it starts. For the 2 different applications, refer to the request body below.  &gt;__Note__: Updating information of an announcement is possible only when the announcement status is scheduled, indicating it hasn&#39;t started yet.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-update-an-announcement ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAnnouncementByIdTest() throws ApiException {
        //String apiToken = null;
        //String uniqueId = null;
        //UpdateAnnouncementByIdData updateAnnouncementByIdData = null;
        //UpdateAnnouncementByIdResponse response = api.updateAnnouncementById(apiToken, uniqueId, updateAnnouncementByIdData);
        // TODO: test validations
    }

    /**
     * View an announcement
     *
     * ## View an announcement  Retrieves information on a specific announcement.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-view-an-announcement ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewAnnouncementByIdTest() throws ApiException {
        //String apiToken = null;
        //String uniqueId = null;
        //ViewAnnouncementByIdResponse response = api.viewAnnouncementById(apiToken, uniqueId);
        // TODO: test validations
    }

}
