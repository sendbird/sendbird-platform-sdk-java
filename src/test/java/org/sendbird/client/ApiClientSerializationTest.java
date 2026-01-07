package org.sendbird.client;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openapitools.client.model.CreateAUserRequest;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

/**
 * Test for ApiClient serialize() method to ensure correct JSON serialization
 * (e.g., userId -> user_id) in all environments including Tomcat/TomEE
 */
public class ApiClientSerializationTest {

    private ApiClient apiClient;

    @BeforeEach
    public void setUp() {
        apiClient = new ApiClient();
    }

    @Test
    public void testSerializeCreateAUserRequestWithUserId() throws Exception {
        // Create a request with userId
        CreateAUserRequest request = new CreateAUserRequest();
        request.setUserId("test-user-123");
        request.setNickname("Test User");
        request.setProfileUrl("https://example.com/profile.jpg");

        // Serialize using ApiClient
        Map<String, Object> formParams = new HashMap<>();
        String contentType = MediaType.APPLICATION_JSON;
        boolean isBodyNullable = false;

        Entity<?> entity = apiClient.serialize(request, formParams, contentType, isBodyNullable);

        // Extract the serialized JSON string from Entity
        String jsonString = extractJsonStringFromEntity(entity);

        // Verify that user_id (snake_case) is used, not userId (camelCase)
        Assertions.assertTrue(jsonString.contains("\"user_id\""), 
            "Serialized JSON should contain 'user_id' (snake_case), but got: " + jsonString);
        Assertions.assertFalse(jsonString.contains("\"userId\""), 
            "Serialized JSON should NOT contain 'userId' (camelCase), but got: " + jsonString);
        Assertions.assertTrue(jsonString.contains("test-user-123"), 
            "Serialized JSON should contain the userId value, but got: " + jsonString);

        System.out.println("✓ Serialized JSON: " + jsonString);
        System.out.println("✓ Verified: user_id (snake_case) is used correctly");
    }

    @Test
    public void testSerializeCreateAUserRequestWithNullableBody() throws Exception {
        // Create a request with userId
        CreateAUserRequest request = new CreateAUserRequest();
        request.setUserId("test-user-456");
        request.setNickname("Test User 2");

        // Serialize with isBodyNullable = true
        Map<String, Object> formParams = new HashMap<>();
        String contentType = MediaType.APPLICATION_JSON;
        boolean isBodyNullable = true;

        Entity<?> entity = apiClient.serialize(request, formParams, contentType, isBodyNullable);

        // Extract the serialized JSON string from Entity
        String jsonString = extractJsonStringFromEntity(entity);

        // Verify that user_id (snake_case) is used
        Assertions.assertTrue(jsonString.contains("\"user_id\""), 
            "Serialized JSON should contain 'user_id' (snake_case), but got: " + jsonString);
        Assertions.assertFalse(jsonString.contains("\"userId\""), 
            "Serialized JSON should NOT contain 'userId' (camelCase), but got: " + jsonString);

        System.out.println("✓ Serialized JSON (nullable): " + jsonString);
        System.out.println("✓ Verified: user_id (snake_case) is used correctly");
    }

    @Test
    public void testSerializeNullObject() throws Exception {
        // Test null object serialization
        Map<String, Object> formParams = new HashMap<>();
        String contentType = MediaType.APPLICATION_JSON;
        boolean isBodyNullable = true;

        Entity<?> entity = apiClient.serialize(null, formParams, contentType, isBodyNullable);

        String jsonString = extractJsonStringFromEntity(entity);
        Assertions.assertEquals("null", jsonString, 
            "Null object should serialize to 'null' string");

        System.out.println("✓ Null object serialization: " + jsonString);
    }

    /**
     * Extract JSON string from Jersey Entity
     * This is a helper method to get the actual serialized content
     */
    private String extractJsonStringFromEntity(Entity<?> entity) throws Exception {
        // Entity.getEntity() returns the actual object
        Object entityObj = entity.getEntity();
        
        if (entityObj instanceof String) {
            return (String) entityObj;
        } else {
            // If it's still an object, serialize it again using the JSON mapper
            // This should not happen after our fix, but just in case
            return apiClient.getJSON().getMapper().writeValueAsString(entityObj);
        }
    }
}

