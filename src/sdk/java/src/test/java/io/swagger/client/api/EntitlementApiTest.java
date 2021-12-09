/*
 * self-managed-osdu
 * Rest API Documentation for Self Managed OSDU
 *
 * OpenAPI spec version: 0.11.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.EntitlementGroupResponse;
import io.swagger.client.model.EntitlementMemberDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EntitlementApi
 */
@Ignore
public class EntitlementApiTest {

    private final EntitlementApi api = new EntitlementApi();

    
    /**
     * Add Member to Group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMemberUsingPOSTTest() throws ApiException {
        String dataPartitionId = null;
        String groupEmail = null;
        EntitlementMemberDto partitionInfo = null;
        EntitlementMemberDto response = api.addMemberUsingPOST(dataPartitionId, groupEmail, partitionInfo);

        // TODO: test validations
    }
    
    /**
     * Create a Group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createGroupUsingPOSTTest() throws ApiException {
        String dataPartitionId = null;
        api.createGroupUsingPOST(dataPartitionId);

        // TODO: test validations
    }
    
    /**
     * Delete a Group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGroupUsingDELETETest() throws ApiException {
        String dataPartitionId = null;
        String groupEmail = null;
        api.deleteGroupUsingDELETE(dataPartitionId, groupEmail);

        // TODO: test validations
    }
    
    /**
     * Delete a User
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMemberUsingDELETETest() throws ApiException {
        String dataPartitionId = null;
        String memberEmail = null;
        api.deleteMemberUsingDELETE(dataPartitionId, memberEmail);

        // TODO: test validations
    }
    
    /**
     * Remove Member from Group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMemberUsingDELETE1Test() throws ApiException {
        String dataPartitionId = null;
        String groupEmail = null;
        String memberEmail = null;
        String response = api.deleteMemberUsingDELETE1(dataPartitionId, groupEmail, memberEmail);

        // TODO: test validations
    }
    
    /**
     * List Group Members
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listGroupMembersUsingGETTest() throws ApiException {
        String dataPartitionId = null;
        String groupEmail = null;
        String role = null;
        Boolean includeType = null;
        api.listGroupMembersUsingGET(dataPartitionId, groupEmail, role, includeType);

        // TODO: test validations
    }
    
    /**
     * List Assigned Groups for User
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listGroupsOnBehalfOfUsingGETTest() throws ApiException {
        String dataPartitionId = null;
        String memberEmail = null;
        String type = null;
        String appid = null;
        api.listGroupsOnBehalfOfUsingGET(dataPartitionId, memberEmail, type, appid);

        // TODO: test validations
    }
    
    /**
     * List Assigned Groups
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listGroupsUsingGETTest() throws ApiException {
        String dataPartitionId = null;
        EntitlementGroupResponse response = api.listGroupsUsingGET(dataPartitionId);

        // TODO: test validations
    }
    
    /**
     * Updates Items in Group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateGroupUsingPATCHTest() throws ApiException {
        String dataPartitionId = null;
        String groupEmail = null;
        api.updateGroupUsingPATCH(dataPartitionId, groupEmail);

        // TODO: test validations
    }
    
}
